public org.springframework.mock.web.MockHttpServletRequest buildRequest(javax.servlet.ServletContext servletContext) {
    org.springframework.mock.web.MockHttpServletRequest request = org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post(loginProcessingUrl).accept(acceptMediaType).param(usernameParam, username).param(passwordParam, password).buildRequest(servletContext);
    return postProcessor.postProcessRequest(request);
}