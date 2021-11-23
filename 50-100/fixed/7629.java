@tailminuseff.Test
public void lineWrittenAfterDeleteGeneratesLineEvent() throws java.lang.Exception {
    this.completionService.submit(target);
    java.nio.file.Files.write(file.toPath(), "".getBytes(), java.nio.file.StandardOpenOption.APPEND);
    java.nio.file.Files.delete(file.toPath());
    testListener.getNextEventAsReset();
    java.nio.file.Files.write(file.toPath(), "ThirdLine\n".getBytes(), java.nio.file.StandardOpenOption.CREATE_NEW);
    assertEquals("ThirdLine", testListener.getNextEventAsLine().getLine());
}