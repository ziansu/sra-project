public void flushToFile() throws java.io.IOException {
    if (!(java.nio.file.Paths.get(com.warptronic.itdm.analyzer.AnalysisWriter.LOCATION).toFile().exists())) {
        java.nio.file.Files.createDirectories(java.nio.file.Paths.get(com.warptronic.itdm.analyzer.AnalysisWriter.LOCATION));
    }
    java.nio.file.Files.write(filePath, lineToWrite, java.nio.charset.StandardCharsets.UTF_8, java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.TRUNCATE_EXISTING, java.nio.file.StandardOpenOption.WRITE);
}