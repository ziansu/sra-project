@org.junit.Test
public void findActionsNoneFound() throws java.lang.Exception {
    org.mockito.Mockito.when(actionService.findAllActionsOrderedByCreatedDateTimeDescending()).thenReturn(new java.util.ArrayList<>());
    org.springframework.test.web.servlet.ResultActions resultActions = mockMvc.perform(uk.gov.ons.ctp.common.MvcHelper.getJson(java.lang.String.format("/actions")));
    resultActions.andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isNoContent()).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler().handlerType(uk.gov.ons.ctp.response.action.endpoint.ActionEndpoint.class)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler().methodName("findActions"));
}