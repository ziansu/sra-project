@org.junit.Test
public void testAllColumnsEmpty() {
    jcsveditor.parser.CSVLineParser parser = new jcsveditor.parser.CSVLineParser(",,,");
    java.util.List<java.lang.String> tokens = parser.parseLine();
    java.lang.String[] actual = new java.lang.String[tokens.size()];
    tokens.toArray(actual);
    java.lang.String[] expected = new java.lang.String[]{ "" , "" , "" };
    org.junit.Assert.assertArrayEquals(expected, actual);
}