@org.junit.Test
public void mapPathToLocation() throws java.lang.Exception {
    org.springframework.mock.web.test.MockHttpServletRequest request = new org.springframework.mock.web.test.MockHttpServletRequest();
    request.setMethod("GET");
    request.setAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE, "/testStylesheet.css");
    org.springframework.web.servlet.resource.ResourceHttpRequestHandler handler = getHandler("/resources/**");
    handler.afterPropertiesSet();
    handler.afterSingletonsInstantiated();
    handler.handleRequest(request, this.response);
    assertEquals("test stylesheet content", this.response.getContentAsString());
}