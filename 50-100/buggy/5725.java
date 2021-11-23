public org.locationtech.geogig.repository.Repository get(final java.lang.String repositoryId) throws java.io.IOException {
    try {
        org.locationtech.geogig.repository.Repository repo = repoCache.get(repositoryId);
        return new org.geogig.geoserver.config.RepositoryCache.UnclosableRepository(repo);
    } catch (java.util.concurrent.ExecutionException e) {
        com.google.common.base.Throwables.propagateIfInstanceOf(e.getCause(), java.io.IOException.class);
        throw new java.io.IOException(("Error obtaining cached geogig instance for repo " + repositoryId), e.getCause());
    }
}