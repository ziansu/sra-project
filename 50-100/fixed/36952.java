void accept(int tokenExpected) throws miniJava.SyntacticAnalyzer.Parser.SyntaxError {
    if ((currentToken.kind) == tokenExpected) {
        previousTokenPosition = currentToken.position;
        currentToken = lexicalAnalyser.scan();
    }else {
        parseError((((("Expecting '" + (miniJava.SyntacticAnalyzer.Token.spell(tokenExpected))) + "' but found '") + (miniJava.SyntacticAnalyzer.Token.spell(currentToken.kind))) + "'"));
    }
}