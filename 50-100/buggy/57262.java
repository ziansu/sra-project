@org.junit.Test
public void testListApplicationsByType() throws java.lang.Exception {
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/apps?type=task").accept(MediaType.APPLICATION_JSON)).andDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print()).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk()).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath("content", org.hamcrest.Matchers.hasSize(1)));
}