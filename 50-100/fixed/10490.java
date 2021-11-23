private void findNextTurn() {
    java.lang.Boolean found = false;
    nextTurn();
    while (!found) {
        if ((!(currentPlayer.getPass())) && (!(currentPlayer.getWon()))) {
            found = true;
        }else {
            nextTurn();
        }
    } 
}