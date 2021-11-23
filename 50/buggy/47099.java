@org.junit.Test
public void runDoNothing() throws java.lang.Exception {
    org.mockito.Mockito.when(rootElement.getElementCount()).thenReturn(10);
    org.mockito.Mockito.when(documentListener.getMaximumLines()).thenReturn(100);
    testling.run();
}