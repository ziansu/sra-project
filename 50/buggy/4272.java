@org.junit.Test
public void testGetUserNotNull() {
    try {
        com.codecool.faceCode.classes.User user = manager.getUserByID(1);
        org.junit.Assert.assertNotNull(user);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}