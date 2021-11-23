private org.mozilla.javascript.AstNode bitAndExpr() throws java.io.IOException {
    org.mozilla.javascript.AstNode pn = eqExpr();
    for (; ;) {
        pushState();
        if (!(matchToken(Token.BITAND, false)))
            break;
        
        int opPos = ts.tokenBeg;
        pn = new org.mozilla.javascript.InfixExpression(Token.BITAND, pn, eqExpr(), opPos);
        popState(pn);
    }
    return pn;
}