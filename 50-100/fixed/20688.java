public boolean hasWinner(java.lang.String token) {
    if (noTokensDropped())
        return false;
    
    if (hasVerticalWinner(token))
        return true;
    
    if (hasHorizontalWinner(token))
        return true;
    
    if (hasForwardSlashDiagonalWinner(token))
        return true;
    
    return hasBackSlashDiagonalWinner(token);
}