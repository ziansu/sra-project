public java.util.List<filter.lexer.Token> lex() {
    java.util.List<filter.lexer.Token> result = new java.util.ArrayList<>();
    filter.lexer.Token previous = null;
    while (((position) < (input.length())) && ((previous == null) || ((previous.getType()) != (TokenType.EOF)))) {
        previous = nextToken();
        result.add(previous);
    } 
    result.add(nextToken());
    return result;
}