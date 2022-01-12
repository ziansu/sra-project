@org.junit.Test
public void findActionByCaseIdNotFound() throws java.lang.Exception {
    org.springframework.test.web.servlet.ResultActions resultActions = mockMvc.perform(getJson(java.lang.String.format("/actions/case/%s", uk.gov.ons.ctp.response.action.endpoint.ActionEndpointUnitTest.NON_EXISTING_ID)));
    resultActions.andExpect(status().isNoContent()).andExpect(handler().handlerType(uk.gov.ons.ctp.response.action.endpoint.ActionEndpoint.class)).andExpect(handler().methodName("findActionsByCaseId"));
}