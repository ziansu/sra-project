public java.util.ArrayList<lexer.Token> tokenize(java.lang.String input) {
    java.util.ArrayList<lexer.Token> resultingTokens = new java.util.ArrayList<lexer.Token>();
    lexer.Token newToken;
    if (input == null) {
        java.lang.System.out.println("Input not set!");
        return null;
    }
    java.util.Collections.sort(token);
    while ((input.length()) > 0) {
        newToken = testTokens(input);
        input = input.substring(newToken.getCompleteLength());
        token.add(newToken);
    } 
    return resultingTokens;
}