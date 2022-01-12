@org.junit.Test
public void setUserNameValid() throws java.lang.Exception {
    assertEquals(null, user.setUserName("harrypotter"));
    assertEquals("harrypotter", user.setUserName("kinggeorge3"));
    assertEquals("kinggeorge3", user.setUserName("i5554321"));
    assertEquals("i554321", user.setUserName("HarryPotter"));
}