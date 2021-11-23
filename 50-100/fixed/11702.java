@org.junit.Test
public void getAll() throws java.lang.Exception {
    com.cinema.controller.rest.CustomerControllerTest.LOGGER.debug("mock test: getAll()");
    java.util.List<com.cinema.model.Customer> customers = new java.util.ArrayList<>();
    customers.add(com.cinema.controller.rest.CustomerControllerTest.CUSTOMER_1);
    customers.add(com.cinema.controller.rest.CustomerControllerTest.CUSTOMER_2);
    expect(customerServiceMock.getAllCustomers()).andReturn(customers);
    replay(customerServiceMock);
    mockMvc.perform(get(com.cinema.controller.rest.CustomerControllerTest.CUSTOMER_GET_ALL).accept(MediaType.APPLICATION_JSON)).andDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print());
}