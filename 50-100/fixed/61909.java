public void initGame() {
    unoPlayer = gamePeer.getUnoPlayer();
    unoDeck = gamePeer.getUnoDeck();
    unoPlayer.drawInitialHand(unoDeck);
    setSumCards(unoPlayer.getHand().size());
    for (unogame.game.UnoCard card : unoPlayer.getHand())
        addCard(card);
    
}