protected static org.apache.samza.system.elasticsearch.actionrequest.ActionRequestFactory getActionRequestFactory(org.apache.samza.config.ElasticsearchConfig config) {
    if (config.getIndexRequestFactoryClassName().isPresent()) {
        return ((org.apache.samza.system.elasticsearch.actionrequest.ActionRequestFactory) (org.apache.samza.util.Util.getObj(config.getActionRequestFactoryClassName().get())));
    }else {
        return new org.apache.samza.system.elasticsearch.indexrequest.IndexRequestFactoryWrapper(new org.apache.samza.system.elasticsearch.indexrequest.DefaultIndexRequestFactory());
    }
}