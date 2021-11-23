private java.lang.String getDisplayableExpression() {
    lexer.reset(expression.toString());
    java.util.ArrayList<com.sensei.easycalc.core.Token> tokens = lexer.getAllTokens();
    java.lang.String s = "";
    for (com.sensei.easycalc.core.Token t : tokens) {
        s += " " + (t.getTokenValue());
    }
    return s;
}