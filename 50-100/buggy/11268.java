private void processExtensionsDependencies() throws org.apache.maven.plugin.MojoExecutionException {
    java.util.Collection<org.apache.maven.artifact.Artifact> artifacts = (isExcludeTransitive()) ? getProject().getDependencyArtifacts() : getProject().getArtifacts();
    for (org.codehaus.mojo.webstart.JnlpExtension extension : jnlpExtensions) {
        org.apache.maven.artifact.resolver.filter.ArtifactFilter filter = new org.apache.maven.artifact.resolver.filter.IncludesArtifactFilter(extension.getIncludes());
        for (org.apache.maven.artifact.Artifact artifact : artifacts) {
            if (filter.include(artifact)) {
                processExtensionDependency(extension, artifact);
            }
        }
    }
}