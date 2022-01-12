private void playerNotPuttedCard() {
    com.axandar.makaoCore.utils.Logger.logConsole(TAG, "Player did not put card");
    if ((sessionInfo.getQuantityCardsToTake()) > 0) {
        playerGetCards(sessionInfo.getQuantityCardsToTake());
        threadPlayer.setWasPuttedCard(false);
    }else
        if ((sessionInfo.getQuantityTurnsToWait()) > 0) {
            threadPlayer.setWasPuttedCard(true);
            playerWaitTurns();
        }else {
            threadPlayer.setWasPuttedCard(false);
            playerGetCard();
        }
    
}