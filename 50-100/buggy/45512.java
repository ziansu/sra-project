public static boolean cardTest() {
    Card.Suit club = Card.Suit.clubs;
    Card.Suit spade = Card.Suit.spades;
    Card.Suit diamonds = Card.Suit.diamonds;
    try {
        Card testCard0 = new Card();
        Card testCard1 = new Card('0', club);
        Card testCard2 = new Card('J', spade);
        Card testCard3 = new Card('Y', diamonds);
        java.lang.System.out.println(testCard0);
        java.lang.System.out.println(testCard1);
        java.lang.System.out.println(testCard2);
        java.lang.System.out.println(testCard3);
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}