@org.junit.Test
public void testSaveAdminSettingsWithEmptyKey() throws java.lang.Exception {
    loginSysAdmin();
    org.thingsboard.server.common.data.AdminSettings adminSettings = doGet("/api/admin/settings/mail", org.thingsboard.server.common.data.AdminSettings.class);
    adminSettings.setKey(null);
    doPost("/api/admin/settings", adminSettings).andExpect(status().isBadRequest()).andExpect(statusReason(containsString("Key should be specified")));
}