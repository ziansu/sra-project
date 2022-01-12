private void check(org.jschema.TokenType type, java.lang.String s) {
    if ((T.getType()) != type) {
        errors.add((((((((("[" + (T.getLineNumber())) + ":") + (T.getColumn())) + "] expecting '") + s) + "', found '") + (T.getString())) + "'"));
    }
    next();
}