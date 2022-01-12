public static HoleCards getHoleCards(Card c1, Card c2) {
    if ((c1.getIndex()) == (c2.getIndex())) {
        throw new java.lang.IllegalArgumentException((("cant be the same card! card with index " + (c1.getIndex())) + " is used twice"));
    }
    return HoleCards.allHoleCards[HoleCards.getIndex(c1, c2)];
}