void setDefaultSslContext(java.lang.String pemFilename) {
    setDefaultSslContext(java.nio.file.Paths.get(io.specto.hoverfly.junit.core.HoverflyUtils.findResourceOnClasspath(pemFilename).getPath()));
}