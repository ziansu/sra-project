public void insertAfter(mondo.token.Token token) {
    tokens.add(((tokenIndex) + 1), token);
    (hardTokenIndex)++;
    (tokenIndex)++;
}