@tailminuseff.Test
public void singleLineFileCallsListenerWithCorrectLine() throws java.lang.Exception {
    org.apache.commons.io.FileUtils.writeStringToFile(file, "Hello World\n");
    this.completionService.submit(target);
    org.junit.Assert.assertEquals("Hello World", testListener.getNextEventAsLine().getLine());
}