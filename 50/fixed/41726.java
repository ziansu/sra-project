private void extractFile(java.io.File archive, java.io.File destinationDirectory) throws com.github.eirslett.maven.plugins.frontend.lib.ArchiveExtractionException {
    logger.info("Unpacking {} into {}", archive, destinationDirectory);
    archiveExtractor.extract(archive.getPath(), destinationDirectory.getPath());
}