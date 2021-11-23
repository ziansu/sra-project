private void setupVictoryCards(int numberOfPlayers) {
    int numOfCards = 12;
    if (numberOfPlayers == 2) {
        numOfCards = 8;
    }
    supply.addToStack(com.dominion.game.EstateCard.class, numOfCards);
    supply.addToStack(com.dominion.game.DuchyCard.class, numOfCards);
    supply.addToStack(com.dominion.game.ProvinceCard.class, numOfCards);
    if (bigCardsUsed) {
        supply.addToStack(com.dominion.game.ColonyCard.class, numOfCards);
    }else {
        supply.addToStack(com.dominion.game.ColonyCard.class, 0);
    }
}