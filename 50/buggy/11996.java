public org.apache.maven.surefire.booter.Classpath getProviderClasspath() throws org.apache.maven.artifact.resolver.ArtifactNotFoundException, org.apache.maven.artifact.resolver.ArtifactResolutionException, org.apache.maven.plugin.surefire.ArtifactResolverException {
    return dependencyResolver.getProviderClasspath("surefire-junit-platform", surefireBooterArtifact.getBaseVersion());
}