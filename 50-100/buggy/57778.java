@org.junit.Test
public void testSaveAdminSettingsWithNonTextValue() throws java.lang.Exception {
    loginSysAdmin();
    org.thingsboard.server.common.data.AdminSettings adminSettings = doGet("/api/admin/settings/mail", org.thingsboard.server.common.data.AdminSettings.class);
    com.fasterxml.jackson.databind.JsonNode json = adminSettings.getJsonValue();
    ((com.fasterxml.jackson.databind.node.ObjectNode) (json)).put("timeout", 10000L);
    adminSettings.setJsonValue(json);
    doPost("/api/admin/settings", adminSettings).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isBadRequest()).andExpect(statusReason(org.hamcrest.Matchers.containsString("Provided json structure can't contain non-text values")));
}