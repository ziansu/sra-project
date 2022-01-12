@org.junit.Test
public void testRegisterUser() throws java.lang.Exception {
    java.lang.String username1 = java.util.UUID.randomUUID().toString();
    java.lang.String password1 = java.util.UUID.randomUUID().toString();
    client.networking.RealServerProxy testProxy = new client.networking.RealServerProxy("104.236.179.174", 8081);
    boolean couldRegister = testProxy.registerUser(username1, password1);
    org.junit.Assert.assertTrue(couldRegister);
    couldRegister = testProxy.registerUser(username1, password1);
    org.junit.Assert.assertTrue((!couldRegister));
}