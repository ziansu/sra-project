void passTurn() {
    pass = true;
    this.addCard(MineralSupertrumps.deck.get(0));
    MineralSupertrumps.deck.remove(0);
    java.lang.System.out.println((("Player " + (id)) + " passes the turn and taking 1 card from the deck"));
}