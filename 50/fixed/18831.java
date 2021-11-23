@org.junit.Test
public void testThrowThrowable() {
    final java.lang.Exception e = new java.lang.Exception("exc");
    final com.twitter.util.Throw<java.lang.Void> t = new com.twitter.util.Throw<java.lang.Void>(e);
    org.junit.Assert.assertEquals(t.throwable(), e);
}