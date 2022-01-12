@org.junit.Test
public void testPasswordHash() throws java.lang.Exception {
    java.lang.String p = "123456";
    java.lang.String hashedPass = com.networknt.utility.HashUtil.generateStorngPasswordHash(p);
    java.lang.System.out.println(("hashedPass = " + hashedPass));
    org.junit.Assert.assertTrue(com.networknt.utility.HashUtil.validatePassword(p, hashedPass));
}