public schemeinterpreter.lexer.Token peek() throws java.io.IOException, schemeinterpreter.SchemeInterpreterException {
    if ((currentToken) == null) {
        next();
    }
    return currentToken;
}