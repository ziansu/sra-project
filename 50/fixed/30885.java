@org.junit.Test
public void testLookupByPhone() {
    java.util.List<org.hni.user.om.User> list = userService.byMobilePhone("479-555-1212");
    assertEquals(1, list.size());
}