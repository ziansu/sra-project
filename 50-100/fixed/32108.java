private java.lang.String toString(final java.lang.Iterable<com.forerunnergames.peril.common.net.packets.card.CardPacket> cards) {
    final java.lang.StringBuilder cardsDescription = new java.lang.StringBuilder();
    for (final com.forerunnergames.peril.common.net.packets.card.CardPacket card : cards) {
        cardsDescription.append(card.getName()).append(" (MSV: ").append(card.getType()).append(")").append(", ");
    }
    cardsDescription.replace(cardsDescription.lastIndexOf(", "), cardsDescription.length(), "");
    return cardsDescription.toString();
}