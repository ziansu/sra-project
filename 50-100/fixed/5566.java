public boolean isGameOver() {
    return (isGameLost()) || (((lastCardPicked) >= 0) && (((getTurn()) - (lastCardPicked)) >= ((hanabi.getPlayerCount()) * (hanabi.getRuleSet().getNbTurnsPerPlayerAfterLastCard()))));
}