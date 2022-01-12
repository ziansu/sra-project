@org.junit.Test
public void TestParse() {
    try {
        com.upokecenter.test.ContentDisposition.Parse(null);
        org.junit.Assert.fail("Should have failed");
    } catch (java.lang.NullPointerException ex) {
        new java.lang.Object();
    } catch (java.lang.Exception ex) {
        org.junit.Assert.fail(ex.toString());
        throw new java.lang.IllegalStateException("", ex);
    }
}