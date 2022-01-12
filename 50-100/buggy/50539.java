@java.lang.Override
public java.net.URI resolve(final java.lang.String repository) {
    org.geogig.geoserver.config.RepositoryManager repositoryManager = org.geogig.geoserver.config.RepositoryManager.get();
    try {
        org.geogig.geoserver.config.RepositoryInfo info = repositoryManager.get(repository);
        java.io.File locFile = new java.io.File(info.getLocation());
        return locFile.toURI();
    } catch (java.io.IOException e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
}