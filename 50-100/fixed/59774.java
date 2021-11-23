public java.util.ArrayList<Card> shuffleCards(java.util.ArrayList<Card> cards) {
    java.util.ArrayList<Card> shuffledCards = new java.util.ArrayList<>();
    for (int i = (cards.size()) - 1; i >= 0; i--) {
        int random = ((int) (java.lang.Math.floor(((java.lang.Math.random()) * i))));
        shuffledCards.add(cards.get(random));
        cards.remove(random);
    }
    return shuffledCards;
}