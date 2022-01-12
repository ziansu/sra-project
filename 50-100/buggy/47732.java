@org.junit.Test
public void TestBodyString() {
    com.upokecenter.test.Message msg = new com.upokecenter.test.Message().SetTextBody("Test");
    java.lang.String mtype = "text/plain;charset=x-unknown";
    msg.setContentType(com.upokecenter.test.MediaType.Parse(mtype));
    try {
        msg.getBodyString().toString();
        org.junit.Assert.fail("Should have failed");
    } catch (java.lang.UnsupportedOperationException ex) {
        new java.lang.Object();
    } catch (java.lang.Exception ex) {
        org.junit.Assert.fail(ex.toString());
        throw new java.lang.IllegalStateException("", ex);
    }
}