@org.junit.Test
public void sameElementsTest() {
    java.util.Scanner scanner = new java.util.Scanner("3\n10 10 10\n");
    scanner.useDelimiter(((java.lang.System.lineSeparator()) + "|\\s"));
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    java.io.PrintStream out = new java.io.PrintStream(baos);
    problem.runFromInput(scanner, true, out);
    assertEquals("10", baos.toString(), "Incorrect result for array [10, 10, 10].");
}