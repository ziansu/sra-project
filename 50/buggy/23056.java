private boolean hasHorizontalWinner(java.lang.String token) {
    com.github.michaelruocco.connectfour.Grid.Row row = getLastDroppedRow();
    if (row.hasWinner(token))
        return true;
    
    return false;
}