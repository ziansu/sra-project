private void setupTreasureCards() {
    supply.addToStack(com.dominion.game.CopperCard.class, 500);
    supply.addToStack(com.dominion.game.SilverCard.class, 500);
    supply.addToStack(com.dominion.game.GoldCard.class, 500);
    if (bigCardsUsed) {
        supply.addToStack(com.dominion.game.PlatinumCard.class, 500);
    }else {
        supply.addToStack(com.dominion.game.PlatinumCard.class, 0);
    }
}