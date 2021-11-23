@Test
public void User_getNameRetrievesName_True() {
    User newUser = new User("Willie", "will123");
    newUser.save();
    newUser.update("Willow");
    assertEquals("Willow", newUser.getName());
}