@org.junit.Test
public void testDispatchNull() throws java.lang.Exception {
    try {
        this.dispatcher.dispatch(null);
        org.junit.Assert.fail();
    } catch (java.lang.NullPointerException e) {
    }
}