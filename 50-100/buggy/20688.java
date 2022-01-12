public boolean hasWinner(java.lang.String token) {
    if (noTokensDropped())
        return false;
    
    if (hasVerticalWinner(token))
        return true;
    
    if (hasHorizontalWinner(token))
        return true;
    
    if (hasForwardSlashDiagonalWinner(token))
        return true;
    
    if (hasBackSlashDiagonalWinner(token))
        return true;
    
    return false;
}