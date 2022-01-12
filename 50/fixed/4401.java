void passTurn() {
    pass = true;
    this.addCard(MineralSupertrumps.deck.get(0));
    MineralSupertrumps.deck.remove(0);
}