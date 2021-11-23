void setDefaultSslContext(java.lang.String pemFilename) {
    setDefaultSslContext(io.specto.hoverfly.junit.core.HoverflyUtils.findResourceOnClasspath(pemFilename));
}