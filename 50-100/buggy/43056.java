private java.lang.String getDisplayableExpression() {
    android.util.Log.d(com.sensei.easycalc.core.ExpressionController.TAG, ("Expression input is " + (expression.toString())));
    lexer.reset(expression.toString());
    java.util.ArrayList<com.sensei.easycalc.core.Token> tokens = lexer.getAllTokens();
    java.lang.String s = "";
    for (com.sensei.easycalc.core.Token t : tokens) {
        s += " " + (t.getTokenValue());
    }
    android.util.Log.d(com.sensei.easycalc.core.ExpressionController.TAG, ("Expression output is " + s));
    return s;
}