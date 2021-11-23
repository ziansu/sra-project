@org.junit.Test
public void getAll() throws java.lang.Exception {
    com.cinema.controller.rest.SessionControllerTest.LOGGER.debug("mock test: getAll()");
    java.util.List<com.cinema.model.Session> sessions = new java.util.ArrayList<>();
    sessions.add(com.cinema.controller.rest.SessionControllerTest.SESSION_1);
    sessions.add(com.cinema.controller.rest.SessionControllerTest.SESSION_2);
    expect(sessionServiceMock.getAllSessions()).andReturn(sessions);
    replay(sessionServiceMock);
    mockMvc.perform(get(com.cinema.controller.rest.SessionControllerTest.SESSION_GET_ALL).accept(MediaType.APPLICATION_JSON)).andDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print());
}