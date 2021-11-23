public static void close() {
    net.serenitybdd.core.photography.DarkroomFileSystem.fileSystemThreadLocal.remove();
}