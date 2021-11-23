public void playCard(Player p, Card c) {
    _lastCardPlayed = c;
    p.removeCardFromHand(c);
}