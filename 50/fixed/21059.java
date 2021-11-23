public mondo.token.Token reset() {
    tokenIndex = 0;
    if ((tokens.size()) < 1)
        return null;
    
    return tokens.get(tokenIndex);
}