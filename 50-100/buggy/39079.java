@org.junit.Test
public void findActionByCaseIdNotFound() throws java.lang.Exception {
    org.springframework.test.web.servlet.ResultActions resultActions = mockMvc.perform(uk.gov.ons.ctp.common.MvcHelper.getJson(java.lang.String.format("/actions/case/%s", uk.gov.ons.ctp.response.action.endpoint.ActionEndpointUnitTest.NON_EXISTING_ID)));
    resultActions.andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isNoContent()).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler().handlerType(uk.gov.ons.ctp.response.action.endpoint.ActionEndpoint.class)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler().methodName("findActionsByCaseId"));
}