private static java.util.Optional<java.util.Properties> getCertConfig(java.nio.file.Path certFile) {
    java.util.Optional<java.nio.file.Path> configFile = de.chkpnt.gradle.plugin.truststorebuilder.TrustStoreBuilderPlugin.getConfigFileForCertificate(certFile);
    if (!(configFile.isPresent())) {
        return java.util.Optional.empty();
    }
    java.util.Properties properties = new java.util.Properties();
    try {
        java.io.InputStream inputStream = java.nio.file.Files.newInputStream(configFile.get());
        properties.load(inputStream);
    } catch (java.io.IOException e) {
        new java.io.UncheckedIOException(e);
    }
    return java.util.Optional.of(properties);
}