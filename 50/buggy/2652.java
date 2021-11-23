@java.lang.Override
public java.lang.String resolveResourcePath(org.carlspring.strongbox.storage.repository.Repository repository, T coordinates) throws java.io.IOException {
    org.carlspring.strongbox.providers.layout.RepositoryPath artifactPath = resolve(repository, coordinates);
    return artifactPath.getRepositoryRelative().toString();
}