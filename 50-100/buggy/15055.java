public void dealFour() {
    if ((deck.size()) > 0) {
        for (int i = 0; i < 4; i++) {
            models.Card drawnCard = deck.get(deck.size());
            deck.remove(deck.size());
            cols.get(i).add(drawnCard);
        }
    }
}