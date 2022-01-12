@org.junit.Test
public void handleReturnValueStringAcceptCharset() throws java.lang.Exception {
    this.servletRequest.addHeader("Accept", "text/plain;charset=UTF-8");
    java.util.List<org.springframework.http.converter.HttpMessageConverter<?>> converters = new java.util.ArrayList<>();
    converters.add(new org.springframework.http.converter.ByteArrayHttpMessageConverter());
    converters.add(new org.springframework.http.converter.StringHttpMessageConverter());
    org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor processor = new org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor(converters);
    processor.writeWithMessageConverters("Foo", returnTypeString, request);
    org.junit.Assert.assertEquals("text/plain;charset=UTF-8", servletResponse.getHeader("Content-Type"));
}