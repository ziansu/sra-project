@org.junit.Test
public void testAcceptHeaderLocale3() throws java.lang.Exception {
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/index.page").locale(java.util.Locale.forLanguageTag("en-US"))).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk()).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.content().string(org.hamcrest.core.StringContains.containsString("Welcome")));
}