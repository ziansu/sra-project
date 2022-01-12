public org.locationtech.geogig.repository.Repository get(final java.lang.String repositoryId) throws java.io.IOException {
    try {
        return repoCache.get(repositoryId);
    } catch (java.util.concurrent.ExecutionException e) {
        com.google.common.base.Throwables.propagateIfInstanceOf(e.getCause(), java.io.IOException.class);
        throw new java.io.IOException(("Error obtaining cached geogig instance for repo " + repositoryId), e.getCause());
    }
}