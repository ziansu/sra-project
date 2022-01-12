public java.util.ArrayList<Card> shuffleCards(java.util.ArrayList<Card> cards) {
    java.util.ArrayList<Card> shuffledCards = new java.util.ArrayList<>();
    for (int i = cards.size(); i > 0; i--) {
        int random = ((int) (java.lang.Math.floor(((java.lang.Math.random()) * i))));
        shuffledCards.add(cards.get(i));
        cards.remove(i);
    }
    return shuffledCards;
}