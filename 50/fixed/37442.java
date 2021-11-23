public schemeinterpreter.lexer.Token peek() throws java.io.IOException, schemeinterpreter.SchemeInterpreterException {
    return (currentToken) != null ? currentToken : next();
}