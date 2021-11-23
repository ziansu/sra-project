@java.lang.Override
public void setCurrentClientServiceName(@com.github.kristofa.brave.internal.Nullable
final java.lang.String serviceName) {
    if (serviceName == null) {
        registry.get().add(new ratpack.zipkin.internal.RatpackServerClientLocalSpanState.ClientEndpointValue(registry.get().get(ratpack.zipkin.internal.RatpackServerClientLocalSpanState.ServerEndpointValue.class).get()));
    }else {
        com.twitter.zipkin.gen.Endpoint serverEndPoint = getServerEndpoint();
        com.twitter.zipkin.gen.Endpoint endpoint = com.twitter.zipkin.gen.Endpoint.create(serviceName, serverEndPoint.ipv4, serverEndPoint.port);
        registry.get().add(new ratpack.zipkin.internal.RatpackServerClientLocalSpanState.ClientEndpointValue(endpoint));
    }
}