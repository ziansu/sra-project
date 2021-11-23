@org.junit.Test
public void cancelActionsCaseNotFound() throws java.lang.Exception {
    org.springframework.test.web.servlet.ResultActions resultActions = mockMvc.perform(putJson(java.lang.String.format("/actions/case/%s/cancel", uk.gov.ons.ctp.response.action.endpoint.ActionEndpointUnitTest.NON_EXISTING_ID), ""));
    resultActions.andExpect(status().isNotFound()).andExpect(handler().handlerType(uk.gov.ons.ctp.response.action.endpoint.ActionEndpoint.class)).andExpect(handler().methodName("cancelActions")).andExpect(jsonPath("$.error.code", org.hamcrest.CoreMatchers.is(CTPException.Fault.RESOURCE_NOT_FOUND.name())));
}