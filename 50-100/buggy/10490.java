private void findNextTurn() {
    java.lang.Boolean found = false;
    nextTurn();
    while (!found) {
        addLog("error6");
        if ((!(currentPlayer.getPass())) && (!(currentPlayer.getWon()))) {
            addLog("found");
            found = true;
        }else {
            nextTurn();
        }
    } 
}