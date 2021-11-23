@org.junit.Test
public void test404() throws java.lang.Exception {
    recordMissing();
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post("/content/1")).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().is(404));
}