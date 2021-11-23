@org.junit.Test
public void testGetSignUpPage() throws java.lang.Exception {
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/signup2")).andExpect(status().isOk()).andExpect(view().name("signup2")).andExpect(model().attributeExists("loginForm")).andExpect(model().attributeExists("signUpMergedForm"));
}