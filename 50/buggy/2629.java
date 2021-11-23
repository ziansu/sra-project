@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testRemoveNPE() throws java.lang.Exception {
    io.vertx.core.http.CaseInsensitiveHeaders cimap = new io.vertx.core.http.CaseInsensitiveHeaders();
    cimap.remove(null);
}