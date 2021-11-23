@org.springframework.context.annotation.Bean
public org.springframework.web.client.RestTemplate restTemplate() {
    org.springframework.web.client.RestTemplate restTemplate = new org.springframework.web.client.RestTemplate();
    restTemplate.setMessageConverters(java.util.Arrays.asList(marshallingHttpMessageConverter()));
    return restTemplate;
}