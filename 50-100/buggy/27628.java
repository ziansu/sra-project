private java.lang.String readCompoundStatement() {
    nextChar();
    java.lang.StringBuilder statement = new java.lang.StringBuilder();
    while ((getCurrentChar()) != '}') {
        statement.append(readStatement());
        skipWhitespaces();
    } 
    nextChar();
    return statement.toString();
}