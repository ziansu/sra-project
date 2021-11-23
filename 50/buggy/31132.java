public void playFirstCard(Card c, GameCategory gc, Player p) {
    _gameCategory = gc;
    if (c != null) {
        _lastCardPlayed = c;
        p.removeCardFromHand(c);
    }else {
        java.lang.System.out.println("card c is null");
    }
}