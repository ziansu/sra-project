private void onDoneClicked() {
    matchNumber = (matchNumber) + 1;
    turnoWords = getRandomWords(6);
    indParolaCorretta = new java.util.Random().nextInt(turnoWords.size());
    sendTurnMessage();
    beginTurn();
    updateViewVisibility();
}