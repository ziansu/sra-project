@org.junit.Test
public void testGetUserNotNull() throws java.lang.Exception {
    com.codecool.faceCode.classes.User user = manager.getUserByID(1);
    org.junit.Assert.assertNotNull(user);
}