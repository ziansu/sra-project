@org.junit.Test
public void should_register_interceptors_for_inbound_and_outbound_channels() {
    org.assertj.core.api.BDDAssertions.then(delegatingWebSocketMessageBrokerConfiguration.clientInboundChannel().getInterceptors().stream().map(java.lang.Object::getClass).collect(java.util.stream.Collectors.toList())).contains(org.springframework.cloud.sleuth.instrument.messaging.TraceChannelInterceptor.class);
    org.assertj.core.api.BDDAssertions.then(delegatingWebSocketMessageBrokerConfiguration.clientOutboundChannel().getInterceptors().stream().map(java.lang.Object::getClass).collect(java.util.stream.Collectors.toList())).contains(org.springframework.cloud.sleuth.instrument.messaging.TraceChannelInterceptor.class);
}