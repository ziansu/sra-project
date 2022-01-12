public static litcore.Card.Suit retenum(int i) {
    switch (i) {
        case 0 :
            return litcore.Card.Suit.HEARTS;
        case 1 :
            return litcore.Card.Suit.DICE;
        case 2 :
            return litcore.Card.Suit.SPADES;
        case 3 :
            return litcore.Card.Suit.CLUBS;
    }
    return litcore.Card.Suit.HEARTS;
}