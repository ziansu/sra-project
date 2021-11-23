@tailminuseff.Test
public void twoLineFileCallsListenerWithCorrectLine() throws java.lang.Exception {
    org.apache.commons.io.FileUtils.writeStringToFile(file, "Hello World\nAnother Line\n");
    this.completionService.submit(target);
    assertEquals("Hello World", testListener.getNextEventAsLine().getLine());
    assertEquals("Another Line", testListener.getNextEventAsLine().getLine());
}