@org.junit.Test
public void testDSLBlock1() throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException, java.io.IOException {
    java.lang.String input = "foo(~)\n" + ("  DSL here!\n" + "bar()\n");
    int[] expected = new int[]{ IDENTIFIER , LPAREN , TILDE , RPAREN , NEWLINE , WHITESPACE , DSLLINE , IDENTIFIER , LPAREN , RPAREN , NEWLINE };
    checkLex(input, expected);
}