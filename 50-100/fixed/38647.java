private static java.nio.file.Path generatePath(java.lang.Object obj, java.lang.String basePath) {
    try {
        java.net.URI uri = obj.getClass().getResource(basePath).toURI();
        org.ballerinalang.repository.fs.JARPackageRepository.initFS(uri);
        java.nio.file.Path result = java.nio.file.Paths.get(uri);
        return result;
    } catch (java.net.URISyntaxException | java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}