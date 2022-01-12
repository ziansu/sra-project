@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testDispatchNull() throws java.lang.Exception {
    this.dispatcher.dispatch(null);
}