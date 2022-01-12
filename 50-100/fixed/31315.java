@org.junit.Test
public void getById() throws java.lang.Exception {
    com.cinema.controller.rest.CustomerControllerTest.LOGGER.debug("mock test: getById()");
    expect(customerServiceMock.getCustomerById(com.cinema.controller.rest.CustomerControllerTest.CUSTOMER_1.getCustomerId())).andReturn(com.cinema.controller.rest.CustomerControllerTest.CUSTOMER_1);
    replay(customerServiceMock);
    mockMvc.perform(get(com.cinema.controller.rest.CustomerControllerTest.CUSTOMER_GET_BY_ID_ID_1).accept(MediaType.APPLICATION_JSON)).andDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print());
}