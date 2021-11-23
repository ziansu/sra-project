@org.junit.Test
public void testAmountOfLinesReaderGivesFalseResult() throws java.lang.Exception {
    org.group17.bubblebobble.MapReader mp = new org.group17.bubblebobble.MapReader();
    org.junit.Assert.assertFalse(((mp.amountOfLinesReader("testLevel.txt")) == 2));
}