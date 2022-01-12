@org.junit.Test
public void testAddUser() {
    java.lang.System.out.println("DATABASE TEST RUN");
    java.lang.String randomUN = java.util.UUID.randomUUID().toString();
    java.lang.String randomPW = java.util.UUID.randomUUID().toString();
    org.junit.Assert.assertTrue(codeu.chat.server.DatabaseTest.con.addAccount(randomUN, randomPW));
}