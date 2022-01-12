@org.junit.Test
public void handleReturnValueSortByQuality() throws java.lang.Exception {
    this.servletRequest.addHeader("Accept", "text/plain; q=0.5, application/json");
    java.util.List<org.springframework.http.converter.HttpMessageConverter<?>> converters = new java.util.ArrayList<>();
    converters.add(new org.springframework.http.converter.json.MappingJackson2HttpMessageConverter());
    converters.add(new org.springframework.http.converter.StringHttpMessageConverter());
    org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor processor = new org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor(converters);
    processor.writeWithMessageConverters("Foo", returnTypeString, request);
    assertEquals("application/json;charset=UTF-8", servletResponse.getHeader("Content-Type"));
}