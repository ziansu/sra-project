@org.junit.Test
public void test2() throws ca.uqac.lif.bullwinkle.BnfParser.ParseException {
    ca.uqac.lif.bullwinkle.BnfParser parser = ca.uqac.lif.bullwinkle.GrammarTests.readGrammar("data/Grammar-0.bnf", "<S>", false);
    java.lang.String expression = "SELECT a FROM t";
    ca.uqac.lif.bullwinkle.ParseNode pn = parser.parse(expression);
    java.lang.String path = "<S>.<selection>.*";
    ca.uqac.lif.bullwinkle.NodePath.getPath(pn, path);
}