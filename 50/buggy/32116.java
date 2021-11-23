@org.springframework.context.annotation.Bean
public org.springframework.web.client.RestTemplate restTemplate() {
    org.springframework.web.client.RestTemplate httpClient = new org.springframework.web.client.RestTemplate(clientHttpRequestFactory());
    return httpClient;
}