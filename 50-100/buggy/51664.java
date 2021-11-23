@org.junit.Test
public void checkIPResolver() {
    s = init("www.google.com:80");
    ps.setServiceParameter(s);
    ps.run();
    org.junit.Assert.assertTrue(ps.isSuccessfulCall());
    org.junit.Assert.assertEquals(null, ps.getErrorCall());
}