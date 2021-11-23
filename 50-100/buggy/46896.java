private com.netflix.discovery.shared.transport.jersey.JerseyEurekaHttpClientFactory buildLegacy() {
    com.netflix.discovery.shared.transport.jersey.EurekaJerseyClientImpl.EurekaJerseyClientBuilder clientBuilder = new com.netflix.discovery.shared.transport.jersey.EurekaJerseyClientImpl.EurekaJerseyClientBuilder().withClientName(clientName).withUserAgent("Java-EurekaClient").withConnectionTimeout(connectionTimeout).withReadTimeout(readTimeout).withMaxConnectionsPerHost(maxConnectionsPerHost).withMaxTotalConnections(maxTotalConnections).withConnectionIdleTimeout(connectionIdleTimeout).withEncoderWrapper(encoderWrapper).withDecoderWrapper(decoderWrapper);
    com.netflix.discovery.shared.transport.jersey.EurekaJerseyClient jerseyClient = clientBuilder.build();
    com.sun.jersey.client.apache4.ApacheHttpClient4 discoveryApacheClient = jerseyClient.getClient();
    addFilters(discoveryApacheClient);
    return new com.netflix.discovery.shared.transport.jersey.JerseyEurekaHttpClientFactory(jerseyClient, allowRedirect);
}