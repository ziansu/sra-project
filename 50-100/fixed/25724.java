@java.lang.Override
public void configureMessageConverters(java.util.List<org.springframework.http.converter.HttpMessageConverter<?>> converters) {
    final org.springframework.http.converter.json.MappingJackson2HttpMessageConverter converter = new org.springframework.http.converter.json.MappingJackson2HttpMessageConverter();
    final com.fasterxml.jackson.databind.ObjectMapper pageMapper = new com.fasterxml.jackson.databind.ObjectMapper();
    pageMapper.setSerializationInclusion(Include.NON_NULL);
    converter.setObjectMapper(pageMapper);
    converters.add(converter);
    super.configureMessageConverters(converters);
}