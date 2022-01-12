@org.junit.Test
public void getAllBySessionId() throws java.lang.Exception {
    com.cinema.controller.rest.CustomerControllerTest.LOGGER.debug("mock test: getAllBySessionId()");
    java.util.List<com.cinema.model.Customer> customers = new java.util.ArrayList<>();
    customers.add(com.cinema.controller.rest.CustomerControllerTest.CUSTOMER_1);
    expect(customerServiceMock.getCustomersBySessionId(com.cinema.controller.rest.CustomerControllerTest.CUSTOMER_1.getSessionId())).andReturn(customers);
    replay(customerServiceMock);
    mockMvc.perform(get("/customer/getAllBySessionId?id=2").accept(MediaType.APPLICATION_JSON)).andDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print());
}