private void startMatch() {
    matchNumber = 0;
    updateTurnIndices();
    if (isMyTurn()) {
        turnoWords = getRandomWords(6);
        indParolaCorretta = new java.util.Random().nextInt(turnoWords.size());
        sendTurnMessage(0);
    }
    beginTurn();
}