@org.junit.Test
public void shouldRegisterAgent() throws java.lang.Exception {
    java.lang.String uuid = java.util.UUID.randomUUID().toString();
    org.springframework.mock.web.MockHttpServletRequest request = new org.springframework.mock.web.MockHttpServletRequest();
    controller.agentRequest("hostname", null, uuid, "sandbox", "100", null, null, null, null, null, null, null, false, request);
    com.thoughtworks.go.config.AgentConfig agentConfig = goConfigService.agentByUuid(uuid);
    org.junit.Assert.assertThat(agentConfig.getHostname(), org.hamcrest.core.Is.is("hostname"));
}