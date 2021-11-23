private void createPiles() {
    piles = new java.util.HashMap<java.lang.Integer, cards.collection.CardSet>();
    for (int i = 1; i <= (Tableau.PILES_NUMBER); i++) {
        piles.put(i, cardSetFactory.getPile((i - 1)));
    }
}