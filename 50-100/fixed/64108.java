public boolean setup() {
    if ((p1.hasCards()) && (p2.hasCards())) {
        p1card = p1.playCard();
        p1card.setLocation(this);
        p2card = p2.playCard();
        p2card.setLocation(this);
        return true;
    }
    return false;
}