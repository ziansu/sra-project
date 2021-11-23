@org.junit.Test
public void getAllWithQuantityTicketsDateToDate() throws java.lang.Exception {
    com.cinema.controller.rest.SessionControllerTest.LOGGER.debug("mock test: getAllWithTicketsDateToDate({}, {})", com.cinema.controller.rest.SessionControllerTest.FIRST_DATE, com.cinema.controller.rest.SessionControllerTest.SECOND_DATE);
    java.util.List<com.cinema.model.SessionWithQuantityTickets> sessions = new java.util.ArrayList<>();
    sessions.add(com.cinema.controller.rest.SessionControllerTest.SESSION_WITH_QUANTITY_TICKETS_1);
    expect(sessionServiceMock.getAllSessionsWithQuantityTicketsDateToDate(com.cinema.controller.rest.SessionControllerTest.FIRST_DATE, com.cinema.controller.rest.SessionControllerTest.SECOND_DATE)).andReturn(sessions);
    replay(sessionServiceMock);
    mockMvc.perform(get(com.cinema.controller.rest.SessionControllerTest.SESSION_GET_ALL_WITH_QUANTITY_TICKETS_DATE_TO_DATE).accept(MediaType.APPLICATION_JSON)).andDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print());
}