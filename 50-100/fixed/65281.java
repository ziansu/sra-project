private void waitAndClean() throws java.io.IOException, java.lang.InterruptedException {
    if (!(complete)) {
        process.waitFor(1L, java.util.concurrent.TimeUnit.SECONDS);
        status = process.exitValue();
        error = (java.nio.file.Files.exists(errPath)) ? org.util.FileSystem.fileToString(errPath) : "";
        if ((status) == 0) {
            java.nio.file.Files.move(tempPath, targetPath, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        }
        java.nio.file.Files.deleteIfExists(tempPath);
        java.nio.file.Files.deleteIfExists(errPath);
        complete = true;
    }
}