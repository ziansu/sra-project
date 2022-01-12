private static void processNewFiles(final java.nio.file.Path inputDir, final java.nio.file.Path outputDir) {
    ru.nekki.test.FileSystemUtil.waitForNewFilesAndProcess(inputDir, outputDir);
}