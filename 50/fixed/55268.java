@tailminuseff.Test
public void singleLineFileCallsListenerWithCorrectEventSource() throws java.lang.Exception {
    org.apache.commons.io.FileUtils.writeStringToFile(file, "Hello World\n");
    this.completionService.submit(target);
    assertEquals(target, testListener.getNextEventAsLine().getSource());
}