public void checkLex(java.lang.String input, int[] kinds) throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException, java.io.IOException {
    java.util.List<wyvern.tools.parsing.coreparser.Token> tokens = new wyvern.tools.lexing.WyvernLexer().parse(new java.io.StringReader(input), "test input");
    checkKinds(kinds, tokens);
    org.junit.Assert.assertEquals(input, concat(tokens));
}