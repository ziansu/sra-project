@java.lang.SuppressWarnings(value = "deprecation")
@org.junit.Test
public void testStartForm() {
    try {
        org.mockito.Mockito.when(customerService.validateCustomer(org.mockito.Matchers.any(com.examples.model.Customer.class))).thenThrow(com.examples.exception.InvalidCredentialsException.class);
        mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/login")).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk()).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl("/WEB-INF/jsp/login.jsp"));
    } catch (java.lang.Exception e) {
        junit.framework.Assert.fail("This should not be called");
    }
}