private java.lang.String getFilePathForZipEntry(org.jboss.windup.graph.model.ArchiveModel archiveModel, java.util.zip.ZipEntry entry) {
    java.lang.String entryName = org.apache.commons.io.FilenameUtils.separatorsToUnix(entry.getName());
    entryName = org.apache.commons.lang.StringUtils.removeEnd(entryName, "/");
    return (org.jboss.windup.graph.service.ArchiveService.getPrefix(archiveModel)) + entryName;
}