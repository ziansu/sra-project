@org.junit.Test
public void testDeleteUser() {
    java.lang.String randomUN = java.util.UUID.randomUUID().toString();
    java.lang.String randomPW = java.util.UUID.randomUUID().toString();
    codeu.chat.server.DatabaseTest.con.addAccount(randomUN, randomPW);
    assertTrue(codeu.chat.server.DatabaseTest.con.deleteAccount(randomUN));
    assertFalse(codeu.chat.server.DatabaseTest.con.verifyAccount(randomUN, randomPW));
    assertTrue(codeu.chat.server.DatabaseTest.con.addAccount(randomUN, randomPW));
}