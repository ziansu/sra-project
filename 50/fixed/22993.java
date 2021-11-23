@java.lang.Override
public org.eclipse.ecf.mgmt.p2.repository.RepositoryMTO getArtifactRepository(java.net.URI location) {
    org.eclipse.ecf.mgmt.p2.repository.RepositoryMTO[] results = getArtifactRepositories(location);
    return (results.length) == 0 ? null : results[0];
}