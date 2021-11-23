@org.junit.Test
public void test() {
    iguana.utils.input.Input input = iguana.utils.input.Input.fromString("a b");
    org.iguana.grammar.Grammar grammar = org.iguana.parser.layout.LayoutTest1.getGrammar();
    org.iguana.parser.ParseResult result = org.iguana.parser.Iguana.parse(input, grammar, Configuration.DEFAULT, org.iguana.grammar.symbol.Nonterminal.withName("S"));
    org.junit.Assert.assertTrue(result.isParseSuccess());
}