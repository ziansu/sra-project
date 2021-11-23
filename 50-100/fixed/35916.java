@org.junit.Test
public void testFindNonExistentApp() throws java.lang.Exception {
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/apps/source/foo").accept(MediaType.APPLICATION_JSON)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().is4xxClientError()).andReturn().getResponse().getContentAsString().contains("NoSuchAppRegistrationException");
}