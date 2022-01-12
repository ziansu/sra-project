@org.testng.annotations.Test
public void testGetImageById() throws java.lang.Exception {
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/svc/admin/images/{id}/info", 1111).header("Accept-Language", "en").header("X-AUTH-TOKEN", authTokenService.getAuthToken())).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().is(200));
}