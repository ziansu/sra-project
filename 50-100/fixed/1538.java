@org.junit.Test
public void shouldSaveTheCustomerDetailsCorrectly() throws java.lang.Exception {
    com.techolution.customerdb.models.Customer customer = getCustomer();
    mockMvc.perform(post(URLs.CUSTOMERS).contentType(MediaType.APPLICATION_JSON).content(customer.toJson())).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isCreated());
    com.techolution.customerdb.models.Customer testUser = customerService.findById(customer.getId());
    org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(customer, testUser, new java.lang.String[]{ "id" , "password" });
}