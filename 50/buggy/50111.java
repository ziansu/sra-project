private static boolean isStringChar(int c) {
    return (schemeinterpreter.lexer.Lexer.isNotNewlineOrEOF(c)) && (c == '"');
}