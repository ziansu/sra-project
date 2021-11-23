@org.junit.Test
public void updateUserTest() {
    java.util.Map<java.lang.String, java.lang.Object> request = new java.util.HashMap<java.lang.String, java.lang.Object>();
    request.put(JsonKey.USER_ID, org.sunbird.services.sso.impl.KeyCloakServiceImplTest.userId);
    request.put(JsonKey.FIRST_NAME, org.sunbird.services.sso.impl.KeyCloakServiceImplTest.userName);
    java.lang.String result = keyCloakService.updateUser(request);
    org.junit.Assert.assertNotNull(result);
}