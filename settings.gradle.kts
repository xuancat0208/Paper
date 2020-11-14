pluginManagement {
    repositories {
        mavenCentral()
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://files.minecraftforge.net/maven/")
        gradlePluginPortal()
        mavenLocal()
    }
}

rootProject.name = "Paper"
include("Paper-API", "Paper-Server")

project(":Paper-API").buildFileName = "../paperApi.gradle.kts"
project(":Paper-Server").buildFileName = "../paperServer.gradle.kts"

gradle.startParameter.showStacktrace = ShowStacktrace.ALWAYS_FULL

