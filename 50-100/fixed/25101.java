public void placeToken(Token token) {
    java.util.List<Token> tokenSet = new java.util.ArrayList<>();
    for (Token t : tokens) {
        if (t.equals(token)) {
            tokenSet.add(token);
        }else {
            tokenSet.add(t);
        }
    }
    tokens = tokenSet;
}