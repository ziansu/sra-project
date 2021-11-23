@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testRemoveNPE() throws java.lang.Exception {
    new io.vertx.core.http.CaseInsensitiveHeaders().remove(null);
}