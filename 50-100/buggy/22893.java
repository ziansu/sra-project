public static org.apache.maven.artifact.repository.metadata.SnapshotVersion createSnapshotVersion(org.apache.maven.artifact.Artifact artifact, java.lang.String extension) {
    org.apache.maven.artifact.repository.metadata.SnapshotVersion snapshotVersion = new org.apache.maven.artifact.repository.metadata.SnapshotVersion();
    snapshotVersion.setVersion(artifact.getVersion());
    snapshotVersion.setExtension(org.apache.commons.io.FilenameUtils.getExtension(extension));
    snapshotVersion.setUpdated(org.carlspring.strongbox.storage.metadata.MetadataHelper.LAST_UPDATED_FIELD_FORMATTER.format(java.util.Calendar.getInstance().getTime()));
    if ((artifact.getClassifier()) != null) {
        snapshotVersion.setClassifier(artifact.getClassifier());
    }
    return snapshotVersion;
}