@org.junit.Test
public void testLoadUsers() {
    model.UserModel theUser = new model.UserModel(null, null);
    try {
        theUser = ((model.UserModel) (view.FileSaving.deSerializeObject("users.ser")));
    } catch (java.io.IOException io) {
        java.lang.System.out.println(io.getMessage());
    } catch (java.lang.ClassNotFoundException c) {
        java.lang.System.out.println(c.getMessage());
    }
    assertEquals(theUser.getUserName(), myNPOUser.getUserName());
}