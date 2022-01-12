@org.junit.Test
public void handleReturnValueString() throws java.lang.Exception {
    java.util.List<org.springframework.http.converter.HttpMessageConverter<?>> converters = new java.util.ArrayList<>();
    converters.add(new org.springframework.http.converter.ByteArrayHttpMessageConverter());
    converters.add(new org.springframework.http.converter.StringHttpMessageConverter());
    org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor processor = new org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor(converters);
    processor.handleReturnValue("Foo", returnTypeString, container, request);
    org.junit.Assert.assertEquals("text/plain;charset=ISO-8859-1", servletResponse.getHeader("Content-Type"));
    org.junit.Assert.assertEquals("Foo", servletResponse.getContentAsString());
}