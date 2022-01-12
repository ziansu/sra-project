@org.junit.Test
public void testEmptyPrintSieve() {
    java.lang.String expectedOutput = "BLANK" + (newLine);
    int[] emptyArray = new int[0];
    outContent.reset();
    Sieve.printSieve(emptyArray);
    java.lang.String output = outContent.toString();
    org.junit.Assert.assertEquals(output, expectedOutput);
    int[] nullArray = null;
    outContent.reset();
    Sieve.printSieve(nullArray);
    output = outContent.toString();
    org.junit.Assert.assertEquals(output, expectedOutput);
}