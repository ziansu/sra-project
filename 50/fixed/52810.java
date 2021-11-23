@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testGetAllNPE() throws java.lang.Exception {
    new io.vertx.core.http.CaseInsensitiveHeaders().getAll(null);
}