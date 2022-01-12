@org.springframework.context.annotation.Bean
@org.springframework.context.annotation.Scope(value = org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST, proxyMode = org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS)
protected org.springframework.web.client.RestTemplate restTemplateWithOAuth2Token() {
    org.springframework.http.client.HttpComponentsClientHttpRequestFactory factory = new org.springframework.http.client.HttpComponentsClientHttpRequestFactory();
    return new org.springframework.web.client.RestTemplate(factory);
}