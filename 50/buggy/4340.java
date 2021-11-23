public void playCard(Player p, Card c) {
    if (c != null) {
        _lastCardPlayed = c;
        p.removeCardFromHand(c);
    }else {
        java.lang.System.out.println("card c is null");
    }
}