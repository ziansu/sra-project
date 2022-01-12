@org.junit.Test
public void testLookupByLastName() {
    java.util.List<org.hni.user.om.User> list = userService.byLastName("Multiphone");
    assertEquals(2, list.size());
}