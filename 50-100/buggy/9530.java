private java.util.Stack<server.Card> initAllCards() {
    cards = new java.util.Stack<>();
    for (java.lang.String symbol : POSSIBLE_SYMBOLS) {
        for (int value : POSSIBLE_VALUES) {
            cards.add(new server.Card(value, symbol));
        }
    }
    shuffle();
    return cards;
}