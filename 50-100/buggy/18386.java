@org.springframework.context.annotation.Bean
public com.peter.spring.utilities.restclient.RestClient provideRestClient(org.springframework.boot.web.client.RestTemplateBuilder templateBuilder) {
    templateBuilder.rootUri(properties.getServerBaseUrl());
    templateBuilder.setConnectTimeout(properties.getConnectionTimeout());
    templateBuilder.setReadTimeout(properties.getReadTimeout());
    return new com.peter.spring.utilities.restclient.DefaultRestClient(templateBuilder.build());
}