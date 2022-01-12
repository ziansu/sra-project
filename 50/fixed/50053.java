public org.elasticsearch.client.transport.TransportClient makeElasticsearchClient(java.util.List<java.net.InetAddress> endpoints) throws java.net.UnknownHostException {
    org.elasticsearch.client.transport.TransportClient client = new org.elasticsearch.transport.client.PreBuiltTransportClient(org.elasticsearch.common.settings.Settings.EMPTY);
    for (java.net.InetAddress endpoint : endpoints) {
        client.addTransportAddress(new org.elasticsearch.common.transport.InetSocketTransportAddress(endpoint, 9300));
    }
    return client;
}