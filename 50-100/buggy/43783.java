@org.junit.Test
public void testAddUser() {
    org.hni.user.om.User user = new org.hni.user.om.User("Scott", "", "479-123-4567");
    user.setGender(Gender.MALE);
    userService.save(user);
    java.util.List<org.hni.user.om.User> list = userService.byMobilePhone("479-123-4567");
    org.junit.Assert.assertEquals(1, list.size());
    org.hni.user.om.User cust = list.get(0);
    org.junit.Assert.assertEquals("Scott", cust.getFirstName());
}