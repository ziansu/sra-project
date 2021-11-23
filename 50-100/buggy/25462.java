private com.heartstone.main.Card drawCard() {
    com.heartstone.main.Card card = deck.get(((int) ((java.lang.Math.random()) * (deck.size()))));
    hand.add(card);
    java.lang.System.out.println(((("The player " + (name)) + " drew the card ") + (card.name())));
    return card;
}