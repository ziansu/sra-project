@org.junit.Test
public void findActionsByActionTypeAndStateNotFound() throws java.lang.Exception {
    org.mockito.Mockito.when(actionService.findActionsByTypeAndStateOrderedByCreatedDateTimeDescending(uk.gov.ons.ctp.response.action.endpoint.ActionEndpointUnitTest.ACTION_TYPE_NOTFOUND, ActionDTO.ActionState.COMPLETED)).thenReturn(new java.util.ArrayList<>());
    org.springframework.test.web.servlet.ResultActions resultActions = mockMvc.perform(getJson(java.lang.String.format("/actions?actiontype=%s&state=%s", uk.gov.ons.ctp.response.action.endpoint.ActionEndpointUnitTest.ACTION_TYPE_NOTFOUND, ActionDTO.ActionState.COMPLETED)));
    resultActions.andExpect(status().isNoContent()).andExpect(handler().handlerType(uk.gov.ons.ctp.response.action.endpoint.ActionEndpoint.class)).andExpect(handler().methodName("findActions"));
}