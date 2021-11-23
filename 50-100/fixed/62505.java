public void shuffle() {
    deck.addAll(discard);
    discard.clear();
    for (int i = (deck.size()) - 1; i > 2; i--) {
        int s = java.util.concurrent.ThreadLocalRandom.current().nextInt((i + 1));
        decks.PlayingCard t = deck.get(s);
        deck.set(s, deck.get(i));
        deck.set(i, t);
    }
}