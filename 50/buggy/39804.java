public static boolean isOperator(final com.googlecode.paradox.parser.TokenType tokenType) {
    for (final com.googlecode.paradox.parser.TokenType token : com.googlecode.paradox.parser.TokenType.OPERATORS) {
        if (token.equals(tokenType)) {
            return true;
        }
    }
    return false;
}