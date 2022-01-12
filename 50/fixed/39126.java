@org.junit.Test
public void testThatClosingTheCurrentWindowInvokesCorrectWebDriverMethods() {
    cut.closeCurrentWindow();
    org.mockito.Mockito.verify(webDriver).close();
}