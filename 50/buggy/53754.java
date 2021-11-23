private org.elasticsearch.hadoop.rest.Resource createResource(java.lang.String target) {
    org.elasticsearch.hadoop.cfg.Settings s = new org.elasticsearch.hadoop.util.TestSettings();
    s.setProperty(ConfigurationOptions.ES_RESOURCE, target);
    return new org.elasticsearch.hadoop.rest.Resource(s, true);
}