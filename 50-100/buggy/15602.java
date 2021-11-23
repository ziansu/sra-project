@org.junit.Test
public void errorPageNotAvailableWithWhitelabelDisabled() throws java.lang.Exception {
    setup(((org.springframework.web.context.ConfigurableWebApplicationContext) (new org.springframework.boot.SpringApplication(org.springframework.boot.autoconfigure.web.BasicErrorControllerDirectMockMvcTests.WebMvcIncludedConfiguration.class).run("--server.port=0", "--error.whitelabel.enabled=false"))));
    thrown.expect(javax.servlet.ServletException.class);
    this.mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/error").accept(MediaType.TEXT_HTML));
}