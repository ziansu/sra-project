@org.junit.Test
public void parseGrammar3a() {
    java.lang.String expression = "(a) & (a)";
    ca.uqac.lif.bullwinkle.ParseNode node = parseIt("data/Grammar-9.bnf", "<S>", expression, true);
    int size = node.getSize();
    int expected_size = 8;
    if (size != expected_size) {
        fail(((((("Incorrect parsing of expression '" + expression) + "': expected a parse tree of size ") + expected_size) + ", got ") + size));
    }
}