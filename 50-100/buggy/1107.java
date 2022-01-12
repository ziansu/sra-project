public void addCard(dev.Same4254.ThisGame.Entities.Card c) {
    slot.addCard(c);
    if (((c.getSymbol()) == (Card.CardSymbols.KEY)) && (!(Prophecy.prophosizing))) {
        gameState.getProphecy().clearAllProphecy();
        gameState.getProphecy().restockProphecy();
        Prophecy.prophosizing = true;
        java.lang.System.out.println("Start Pro");
    }
}