public mondo.token.Token hardReset() {
    finished = false;
    hardTokenIndex = 0;
    tokenIndex = hardTokenIndex;
    if ((tokens.size()) < 1)
        return null;
    
    return tokens.get(tokenIndex);
}