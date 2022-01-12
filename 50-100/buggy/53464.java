@org.junit.Test
public void shouldNotRegisterAgentWhenValidationFails() throws java.lang.Exception {
    org.springframework.mock.web.MockHttpServletRequest request = new org.springframework.mock.web.MockHttpServletRequest();
    int totalAgentsBeforeRegistrationRequest = goConfigService.agents().size();
    controller.agentRequest("hostname", null, "sandbox", "100", null, null, null, null, null, null, null, false, request);
    int totalAgentsAfterRegistrationRequest = goConfigService.agents().size();
    org.junit.Assert.assertThat(totalAgentsBeforeRegistrationRequest, org.hamcrest.core.Is.is(totalAgentsAfterRegistrationRequest));
}