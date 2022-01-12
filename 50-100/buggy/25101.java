public void placeToken(Token token) {
    java.util.Set<Token> tokenSet = new java.util.HashSet<>();
    for (Token t : tokens) {
        if (t.equals(token)) {
            tokenSet.add(token);
        }else {
            tokenSet.add(t);
        }
    }
    tokens = tokenSet;
}