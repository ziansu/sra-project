@org.junit.Test
public void testUsername() throws java.lang.Exception {
    com.rusticisoftware.tincan.RemoteLRS obj = new com.rusticisoftware.tincan.RemoteLRS();
    obj.setPassword("pass");
    org.junit.Assert.assertNull(obj.getUsername());
    org.junit.Assert.assertNull(obj.getAuth());
    obj.setUsername("test");
    org.junit.Assert.assertEquals("test", obj.getUsername());
    org.junit.Assert.assertEquals(obj.getAuth(), "Basic dGVzdDpwYXNz");
}