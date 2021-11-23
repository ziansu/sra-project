@org.junit.Test
public void testExistingContent() throws java.lang.Exception {
    recordExists();
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/content/1")).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().is(200)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.content().json(expectedContent()));
}