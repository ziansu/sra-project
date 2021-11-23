@java.lang.Override
public java.lang.String getValue(mage.game.Game game) {
    java.lang.StringBuilder sb = mage.cards.CardsImpl.threadLocalBuilder.get();
    java.util.SortedSet<java.lang.String> cards = new java.util.TreeSet<>();
    for (java.util.UUID cardId : this) {
        mage.cards.Card card = game.getCard(cardId);
        cards.add(card.getName());
    }
    for (java.lang.String name : cards) {
        sb.append(name).append(":");
    }
    return sb.toString();
}