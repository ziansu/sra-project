@org.junit.Test
public void pageNotFoundTest() throws java.lang.Exception {
    java.lang.String user = "tester";
    mockMvc.perform(get((("/" + user) + "/products/"))).andExpect(status().isNotFound());
}