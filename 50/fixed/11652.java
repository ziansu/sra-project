@java.lang.Override
protected org.apache.ignite.configuration.IgniteConfiguration getConfiguration(java.lang.String gridName) throws java.lang.Exception {
    org.apache.ignite.configuration.IgniteConfiguration cfg = super.getConfiguration(gridName);
    cfg.setCacheConfiguration(cacheConfiguration());
    return cfg;
}