@org.junit.Test
public void testNegativeInt() throws wyvern.tools.parsing.coreparser.ParseException {
    java.lang.String input = "-5\n";
    testPyFromInput(input, "-5");
}