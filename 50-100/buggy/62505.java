public void shuffle() {
    deck.addAll(discard);
    discard.clear();
    for (int i = deck.size(); i > 2; i--) {
        int s = java.util.concurrent.ThreadLocalRandom.current().nextInt(i);
        decks.PlayingCard t = deck.get(s);
        deck.set(s, deck.get(i));
        deck.set(i, t);
    }
}