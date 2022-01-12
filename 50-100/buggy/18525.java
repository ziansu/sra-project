@org.junit.Test
public void testDeleteUser() {
    java.lang.String randomUN = java.util.UUID.randomUUID().toString();
    java.lang.String randomPW = java.util.UUID.randomUUID().toString();
    codeu.chat.server.DatabaseTest.con.addAccount(randomUN, randomPW);
    org.junit.Assert.assertTrue(codeu.chat.server.DatabaseTest.con.deleteAccount(randomUN));
    org.junit.Assert.assertFalse(codeu.chat.server.DatabaseTest.con.verifyAccount(randomUN, randomPW));
    org.junit.Assert.assertTrue(codeu.chat.server.DatabaseTest.con.addAccount(randomUN, randomPW));
}