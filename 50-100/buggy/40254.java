@org.junit.Test
public void xremoveUserTest() {
    java.util.Map<java.lang.String, java.lang.Object> request = new java.util.HashMap<java.lang.String, java.lang.Object>();
    request.put(JsonKey.USER_ID, org.sunbird.services.sso.impl.KeyCloakServiceImplTest.userId);
    java.lang.String result = keyCloakService.removeUser(request);
    org.junit.Assert.assertNotNull(result);
}