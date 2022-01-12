@org.junit.Test(expected = java.io.FileNotFoundException.class)
public void mockEmptyMethodException() {
    de.aikiit.jmockex.UrlConnector spy = spy(de.aikiit.jmockex.UrlConnector.class);
    doThrow(new java.io.FileNotFoundException()).when(spy).getConnection();
    spy.getConnection();
}