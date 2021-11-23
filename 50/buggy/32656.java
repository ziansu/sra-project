public java.util.List<de.interoberlin.lymbo.model.card.Card> getCards() {
    if ((cards.get(0)) != null) {
        cards.add(0, null);
    }
    return cards;
}