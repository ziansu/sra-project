private java.lang.String readCompoundStatement() {
    nextChar();
    skipWhitespaces();
    java.lang.StringBuilder statement = new java.lang.StringBuilder();
    while ((getCurrentChar()) != '}') {
        statement.append(readStatement());
        skipWhitespaces();
    } 
    nextChar();
    return statement.toString();
}