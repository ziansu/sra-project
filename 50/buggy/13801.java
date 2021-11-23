@org.junit.Test
public void pageNotFoundTest() throws java.lang.Exception {
    java.lang.String user = "tester";
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get((("/" + user) + "/products/"))).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isNotFound());
}