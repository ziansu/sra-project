@org.junit.Test
public void testSimple_expression() {
    java.lang.String test = "5 - 33 / 10 * 5";
    parser.MyParser parser = new parser.MyParser(test, false);
    parser.simple_expression();
    java.lang.System.out.println((("Statement " + test) + " Passed!"));
    test = "(-1) * love - 25 / 6 + 3";
    parser = new parser.MyParser(test, false);
    parser.symbolTable.add("love", Kinds.VARIABLE, "INTEGER", null, null);
    parser.simple_expression();
    java.lang.System.out.println((("Statement " + test) + " Passed!"));
}