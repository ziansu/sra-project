@java.lang.Override
public com.example.poker.service.Card getCardFromTop() throws java.lang.Exception {
    try {
        int next = new java.util.Random(java.lang.System.currentTimeMillis()).nextInt(((this.deck.size()) == 0 ? 1 : this.deck.size()));
        com.example.poker.service.Card c = this.deck.remove(next);
        out.add(c);
        return c;
    } catch (java.lang.IndexOutOfBoundsException e) {
        throw new java.lang.Exception("No more cards");
    }
}