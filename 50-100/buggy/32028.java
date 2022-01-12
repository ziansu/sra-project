private org.apache.maven.model.Dependency createSystemScopeDependency(org.apache.maven.artifact.Artifact artifact, java.io.File location, java.lang.String suffix) {
    java.lang.String artifactId = artifact.getArtifactId();
    if (suffix != null) {
        artifactId = "_" + suffix;
    }
    final org.apache.maven.model.Dependency dependency = new org.apache.maven.model.Dependency();
    dependency.setGroupId(artifact.getGroupId());
    dependency.setArtifactId(artifactId);
    dependency.setVersion(artifact.getVersion());
    dependency.setScope(Artifact.SCOPE_SYSTEM);
    dependency.setSystemPath(location.getAbsolutePath());
    return dependency;
}