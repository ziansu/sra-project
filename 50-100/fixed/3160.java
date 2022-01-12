@java.lang.Override
public org.springframework.mock.web.MockHttpServletRequest buildRequest(javax.servlet.ServletContext servletContext) {
    org.springframework.mock.web.MockHttpServletRequest request = org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post(this.loginProcessingUrl).accept(this.acceptMediaType).param(this.usernameParam, this.username).param(this.passwordParam, this.password).buildRequest(servletContext);
    return this.postProcessor.postProcessRequest(request);
}