private boolean hasVerticalWinner(java.lang.String token) {
    if (lastDroppedColumn.hasWinner(token))
        return true;
    
    return false;
}