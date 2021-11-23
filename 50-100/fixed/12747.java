@org.junit.Test
public void TestContentType() {
    com.upokecenter.test.Message msg = new com.upokecenter.test.Message().SetTextBody("text");
    msg.setContentType(com.upokecenter.test.MediaType.Parse("text/html"));
    try {
        msg.setContentType(null);
        org.junit.Assert.fail("Should have failed");
    } catch (java.lang.NullPointerException ex) {
    } catch (java.lang.Exception ex) {
        org.junit.Assert.fail(ex.toString());
        throw new java.lang.IllegalStateException("", ex);
    }
}