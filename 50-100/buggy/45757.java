public void setDeck(org.magic.api.beans.MagicDeck deck) {
    this.deck = deck;
    deckDetailsPanel.setMagicDeck(deck);
    deckmodel.init(deck);
    p = new org.magic.game.Player(deck);
    org.magic.game.GameManager.getInstance().addPlayer(p);
    org.magic.game.GameManager.getInstance().nextTurn();
    org.magic.gui.game.GamePanel.getInstance().setPlayer(p);
}