@org.junit.Test
public void findActionsNoneFound() throws java.lang.Exception {
    org.mockito.Mockito.when(actionService.findAllActionsOrderedByCreatedDateTimeDescending()).thenReturn(new java.util.ArrayList<>());
    org.springframework.test.web.servlet.ResultActions resultActions = mockMvc.perform(getJson(java.lang.String.format("/actions")));
    resultActions.andExpect(status().isNoContent()).andExpect(handler().handlerType(uk.gov.ons.ctp.response.action.endpoint.ActionEndpoint.class)).andExpect(handler().methodName("findActions"));
}