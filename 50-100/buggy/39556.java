public boolean acceptAllIfPossible(java.lang.String... tokens) throws ch.astorm.ssmt.tools.sql.SQLAnalyzerException {
    if ((tokens.length) == 0) {
        throw new java.lang.IllegalArgumentException("At least one token needed");
    }
    ch.astorm.ssmt.tools.sql.SQLToken tkn = peek();
    if (tkn == null) {
        throw new ch.astorm.ssmt.tools.sql.SQLAnalyzerException("Unexpected end of token list", tokens, null);
    }
    if (tkn.equals(tokens[0])) {
        acceptAll(tokens);
        return true;
    }
    return false;
}