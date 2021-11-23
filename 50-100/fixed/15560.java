public void startTurn() {
    checkProduction();
    if ((roundNumber) > 0) {
        timeLeft = getTimeAfterFoodCheck();
    }
    if (((roundNumber) == 1) && ((currentPlayer) == (players.get(0)))) {
        Controller.MasterController.getInstance().getMapController().startTimer();
    }
    refreshLabels();
}