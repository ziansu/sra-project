@java.lang.Override
public java.lang.String getValue(mage.game.Game game) {
    java.lang.StringBuilder sb = mage.cards.CardsImpl.threadLocalBuilder.get();
    java.util.List<java.lang.String> cards = new java.util.ArrayList<>();
    for (java.util.UUID cardId : this) {
        mage.cards.Card card = game.getCard(cardId);
        cards.add(card.getName());
    }
    java.util.Collections.sort(cards);
    for (java.lang.String name : cards) {
        sb.append(name).append(":");
    }
    return sb.toString();
}