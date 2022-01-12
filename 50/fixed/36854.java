@org.junit.Test
public void pageFoundTest() throws java.lang.Exception {
    mockMvc.perform(get("/admin/products")).andExpect(status().isOk());
}