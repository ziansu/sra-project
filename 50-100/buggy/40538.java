@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> getConfigurationProperties() {
    final java.util.Map<java.lang.String, java.lang.String> props = com.google.common.collect.Maps.newHashMap();
    org.estatio.app.EstatioAppManifest.loadPropsInto(props, "isis-non-changing.properties");
    if ((fixtureScripts) == null) {
        org.estatio.app.EstatioAppManifest.withInstallFixtures(props);
    }
    return props;
}