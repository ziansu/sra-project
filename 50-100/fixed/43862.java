@org.junit.Test
public void testListSingleApplication() throws java.lang.Exception {
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/apps/source/time").accept(MediaType.APPLICATION_JSON)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk()).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath("name", org.hamcrest.Matchers.is("time"))).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath("type", org.hamcrest.Matchers.is("source")));
}