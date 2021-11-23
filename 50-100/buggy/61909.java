public void initGame() {
    unoPlayer = gamePeer.getUnoPlayer();
    unoDeck = gamePeer.getUnoDeck();
    unoPlayer.drawInitialHand(unoDeck);
    for (unogame.game.UnoCard card : unoPlayer.getHand())
        addCard(card);
    
    setSumCards(unoPlayer.getHand().size());
}