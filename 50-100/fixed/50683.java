static org.elasticsearch.client.Client setupClient(java.lang.String esClusterName, java.lang.String esHostName, int esPortNum) {
    @java.lang.SuppressWarnings(value = "unused")
    org.elasticsearch.common.settings.Settings settings = org.elasticsearch.common.settings.ImmutableSettings.settingsBuilder().put("cluster.name", esClusterName).build();
    org.elasticsearch.client.Client client = new org.elasticsearch.client.transport.TransportClient(settings).addTransportAddress(new org.elasticsearch.common.transport.InetSocketTransportAddress(esHostName, esPortNum));
    return client;
}