private void accept(miniJava.SyntacticAnalyzer.TokenType type) throws java.io.IOException, miniJava.SyntacticAnalyzer.SyntaxException {
    if ((token.type) == type) {
        token = scanner.scan();
    }else
        parseException((((("Expecting token of type " + type) + " but got token of type ") + (token.type)) + "."));
    
}