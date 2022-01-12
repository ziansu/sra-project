@org.junit.Test
public void getById() throws java.lang.Exception {
    com.cinema.controller.rest.SessionControllerTest.LOGGER.debug("mock test: getById()");
    expect(sessionServiceMock.getSessionById(com.cinema.controller.rest.SessionControllerTest.SESSION_1.getSessionId())).andReturn(com.cinema.controller.rest.SessionControllerTest.SESSION_1);
    replay(sessionServiceMock);
    mockMvc.perform(get(com.cinema.controller.rest.SessionControllerTest.SESSION_GET_BY_ID).accept(MediaType.APPLICATION_JSON)).andDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print());
}