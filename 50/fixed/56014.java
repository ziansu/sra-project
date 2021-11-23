@org.junit.Test
public void testAmountOfLinesReaderGivesCorrectResult() throws java.lang.Exception {
    org.junit.Assert.assertEquals(org.group17.bubblebobble.TestMapReader.AMOUNT_OF_LINES_TEST_FILE, org.group17.bubblebobble.MapReader.amountOfLinesReader("testLevel.txt"));
}