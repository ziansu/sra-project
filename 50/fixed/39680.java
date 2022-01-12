private void checkLayout(java.lang.String repositoryId, java.lang.String layoutId, org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout layout) throws java.lang.Exception {
    if (layout == null) {
        throw new java.lang.Exception(java.lang.String.format("Cannot find ArtifactRepositoryLayout instance for: %s %s", layoutId, repositoryId));
    }
}