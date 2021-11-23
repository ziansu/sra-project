public java.lang.String extractArchives(java.lang.String scannerBaseDir, int archiveExtractionDepth) {
    org.whitesource.agent.archive.ArchiveExtractor.logger.debug("Base directory is {}, extraction depth is set to {}", scannerBaseDir, archiveExtractionDepth);
    java.lang.String destDirectory = org.whitesource.agent.archive.ArchiveExtractor.TEMP_FOLDER;
    int separatorIndex = scannerBaseDir.lastIndexOf(java.io.File.separator);
    if (separatorIndex != (-1)) {
        destDirectory = destDirectory + (scannerBaseDir.substring(separatorIndex, scannerBaseDir.length()));
    }
    extractArchive(scannerBaseDir, destDirectory, archiveExtractionDepth, 0);
    return destDirectory;
}