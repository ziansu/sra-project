public static synchronized com.redhat.lightblue.config.LightblueFactory createFactory(final com.redhat.lightblue.config.DataSourcesConfiguration ds) {
    com.redhat.lightblue.rest.RestConfiguration.datasources = ds;
    com.redhat.lightblue.rest.RestConfiguration.factory = new com.redhat.lightblue.config.LightblueFactory(ds);
    return com.redhat.lightblue.rest.RestConfiguration.factory;
}