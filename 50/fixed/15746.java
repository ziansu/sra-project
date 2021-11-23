@org.junit.Test
public void selectByIdTest() {
    assertEquals("USER1", userDAO.selectById(1).getUserName());
}