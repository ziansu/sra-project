@tailminuseff.Test
public void windowsLineEndingsSplitLinesAlso() throws java.lang.Exception {
    java.nio.file.Files.write(file.toPath(), "Hello World\r\n".getBytes(), java.nio.file.StandardOpenOption.APPEND);
    this.completionService.submit(target);
    org.junit.Assert.assertEquals("Hello World", testListener.getNextEventAsLine().getLine());
}