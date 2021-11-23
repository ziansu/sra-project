@org.junit.Test
public void setDefaultContentType() throws java.lang.Exception {
    this.factoryBean.setDefaultContentType(java.util.Arrays.asList(MediaType.APPLICATION_JSON));
    this.factoryBean.afterPropertiesSet();
    org.springframework.web.accept.ContentNegotiationManager manager = this.factoryBean.getObject();
    org.junit.Assert.assertEquals(java.util.Collections.singletonList(MediaType.APPLICATION_JSON), manager.resolveMediaTypes(this.webRequest));
    this.servletRequest.addHeader("Accept", MediaType.ALL_VALUE);
    org.junit.Assert.assertEquals(java.util.Collections.singletonList(MediaType.APPLICATION_JSON), manager.resolveMediaTypes(this.webRequest));
}