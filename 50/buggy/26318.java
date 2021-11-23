private boolean checkIfHasToSwapTurn(java.lang.Integer last) {
    if (last == (table.getTrayByPlayer(getActivePlayerId()).getIndex()))
        return false;
    else
        return true;
    
}