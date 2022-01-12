@org.junit.Test
public void testAddUser() {
    org.hni.user.om.User user = new org.hni.user.om.User("Scott", "", "479-123-4567");
    user.setGender(Gender.MALE);
    userService.save(user);
    java.util.List<org.hni.user.om.User> list = userService.byMobilePhone("479-123-4567");
    assertEquals(1, list.size());
    org.hni.user.om.User cust = list.get(0);
    assertEquals("Scott", cust.getFirstName());
}