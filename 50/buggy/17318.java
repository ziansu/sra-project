public void initialize(monopoly.Card[] cards) {
    SIZE = cards.length;
    deck.addAll(java.util.Arrays.asList(cards));
    java.util.Collections.shuffle(deck);
}