public ch.chrisrayrayne.card.Card drawFromPile(java.util.ArrayList<ch.chrisrayrayne.card.Card> pile) {
    ch.chrisrayrayne.card.Card drawnCard = null;
    if ((pile.size()) > 0) {
        drawnCard = pile.get(0);
        this.addCard(drawnCard);
        pile.remove(0);
    }
    return drawnCard;
}