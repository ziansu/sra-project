public static boolean containsTimestampedSnapshotVersion(org.apache.maven.artifact.repository.metadata.Metadata metadata, java.lang.String timestampedSnapshotVersion, java.lang.String classifier) {
    for (org.apache.maven.artifact.repository.metadata.SnapshotVersion snapshotVersion : metadata.getVersioning().getSnapshotVersions()) {
        if (((snapshotVersion.getVersion().equals(timestampedSnapshotVersion)) && (classifier == null)) || (snapshotVersion.getClassifier().equals(classifier))) {
            return true;
        }
    }
    return false;
}