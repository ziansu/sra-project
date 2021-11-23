@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testGetAllNPE() throws java.lang.Exception {
    io.vertx.core.http.CaseInsensitiveHeaders cimap = new io.vertx.core.http.CaseInsensitiveHeaders();
    cimap.getAll(null);
}