@org.springframework.context.annotation.Bean
@org.springframework.beans.factory.annotation.Autowired
@org.springframework.context.annotation.Profile(value = "!test")
net.smartcosmos.events.SmartCosmosEventTemplate smartCosmosEventTemplate(org.springframework.cloud.netflix.ribbon.RibbonClientHttpRequestFactory ribbonClientHttpRequestFactory, java.util.concurrent.Executor smartCosmosEventTaskExecutor) {
    org.springframework.web.client.RestTemplate eventRestTemplate = new org.springframework.web.client.RestTemplate();
    eventRestTemplate.setRequestFactory(ribbonClientHttpRequestFactory);
    return new net.smartcosmos.events.rest.RestSmartCosmosEventTemplate(eventRestTemplate, smartCosmosEventsProperties.getServiceName(), smartCosmosEventsProperties.getHttpMethod(), smartCosmosEventsProperties.getUrl(), smartCosmosEventTaskExecutor);
}