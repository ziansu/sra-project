@org.junit.Test
public void findActionsByActionTypeNotFound() throws java.lang.Exception {
    org.mockito.Mockito.when(actionService.findActionsByType(uk.gov.ons.ctp.response.action.endpoint.ActionEndpointUnitTest.ACTION_TYPE_NOTFOUND)).thenReturn(new java.util.ArrayList<uk.gov.ons.ctp.response.action.domain.model.Action>());
    org.springframework.test.web.servlet.ResultActions resultActions = mockMvc.perform(uk.gov.ons.ctp.common.MvcHelper.getJson(java.lang.String.format("/actions?actiontype=%s", uk.gov.ons.ctp.response.action.endpoint.ActionEndpointUnitTest.ACTION_TYPE_NOTFOUND)));
    resultActions.andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isNoContent()).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler().handlerType(uk.gov.ons.ctp.response.action.endpoint.ActionEndpoint.class)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler().methodName("findActions"));
}