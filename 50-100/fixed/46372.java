@org.junit.Test
public void TestSetBody() {
    try {
        new com.upokecenter.test.Message().SetBody(null);
        org.junit.Assert.fail("Should have failed");
    } catch (java.lang.NullPointerException ex) {
    } catch (java.lang.Exception ex) {
        org.junit.Assert.fail(ex.toString());
        throw new java.lang.IllegalStateException("", ex);
    }
}