private void accept(miniJava.SyntacticAnalyzer.TokenType type) throws java.io.IOException, miniJava.SyntacticAnalyzer.SyntaxException {
    java.lang.System.out.println(((("Trying to accept token of type " + (token.type)) + " with spelling ") + (token.spelling)));
    if ((token.type) == type)
        token = scanner.scan();
    else
        parseException((((("Expecting token of type " + type) + " but got token of type ") + (token.type)) + "."));
    
}