private void runTurnHuman() {
    confirm = false;
    if (((!(currentPlayer.getPass())) && (!(roundEnd))) && (!(currentPlayer.getWon()))) {
        confirm = checkMagnetite();
        if (!(confirm)) {
            processCard();
        }
    }
}