public void dealFour() {
    if ((deck.size()) > 0) {
        for (int i = 0; i < 4; i++) {
            models.Card drawnCard = deck.get(((deck.size()) - 1));
            deck.remove(((deck.size()) - 1));
            cols.get(i).add(drawnCard);
        }
    }
}