@org.junit.Test
public void testEmptyConstructor() {
    com.mycf.sprigcloud.user_service.domain.User u = new com.mycf.sprigcloud.user_service.domain.User();
    java.lang.String name = "name";
    int userId = 1;
    java.lang.String emailAddress = "email";
    u.setName(name);
    u.setUserId(userId);
    u.setEmailAddress(emailAddress);
    assertEquals(name, u.getName());
    assertEquals(userId, u.getUserId());
    assertEquals(emailAddress, u.getEmailAddress());
}