public void addCard(dev.Same4254.ThisGame.Entities.Card c) {
    slot.addCard(c);
    if (((c.getSymbol()) == (Card.CardSymbols.KEY)) && (!(Prophecy.prophosizing))) {
        gameState.getProphecy().clearAllProphecy();
        gameState.getProphecy().restockProphecy();
        java.lang.System.out.println("Start Pro");
    }
}