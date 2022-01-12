@java.lang.Override
public org.eclipse.ecf.mgmt.p2.repository.RepositoryMTO getMetadataRepository(java.net.URI location) {
    org.eclipse.ecf.mgmt.p2.repository.RepositoryMTO[] repos = getMetadataRepositories(location);
    return (repos.length) == 0 ? null : repos[0];
}