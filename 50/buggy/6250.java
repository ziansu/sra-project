private static boolean isIntegerChar(int c) {
    return (schemeinterpreter.lexer.Lexer.isNotNewlineOrEOF(c)) && (java.lang.Character.isDigit(c));
}