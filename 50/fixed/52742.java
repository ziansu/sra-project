public void insertAfter(mondo.token.Token token) {
    tokens.add(((tokenIndex) + 1), token);
    if (((tokenIndex) + 1) <= (hardTokenIndex))
        (hardTokenIndex)++;
    
    (tokenIndex)++;
}