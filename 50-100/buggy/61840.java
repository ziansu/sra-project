@org.springframework.context.annotation.Bean
@org.springframework.context.annotation.Profile(value = "!test")
net.smartcosmos.events.SmartCosmosEventTemplate smartCosmosEventTemplate(org.springframework.cloud.netflix.ribbon.RibbonClientHttpRequestFactory ribbonClientHttpRequestFactory, org.springframework.security.oauth2.client.OAuth2ClientContext oAuth2ClientContext, java.util.concurrent.Executor smartCosmosEventTaskExecutor) {
    org.springframework.web.client.RestTemplate eventRestTemplate = new org.springframework.web.client.RestTemplate();
    eventRestTemplate.setRequestFactory(ribbonClientHttpRequestFactory);
    return new net.smartcosmos.events.rest.RestSmartCosmosEventTemplate(eventRestTemplate, oAuth2ClientContext, smartCosmosEventsProperties.getServiceName(), smartCosmosEventsProperties.getHttpMethod(), smartCosmosEventsProperties.getUrl(), smartCosmosEventTaskExecutor);
}