@org.junit.Test
public void parseGrammar2b() {
    java.lang.String expression = "SELECT a FROM (SELECT b FROM t)";
    ca.uqac.lif.bullwinkle.ParseNode node = parseIt("data/Grammar-1.bnf", "<S>", expression, true);
    int size = node.getSize();
    int expected_size = 19;
    if (size != expected_size) {
        fail(((((("Incorrect parsing of expression '" + expression) + "': expected a parse tree of size ") + expected_size) + ", got ") + size));
    }
}