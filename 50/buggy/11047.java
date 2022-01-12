@org.junit.Test
public void testArithmetic() throws wyvern.tools.parsing.coreparser.ParseException {
    java.lang.String input = "import stdlib:ints\n" + ("val x = ((5 + 3) / 2) * 2 - 1\n" + "x\n");
    testPyFromInput(input, "7", true);
}