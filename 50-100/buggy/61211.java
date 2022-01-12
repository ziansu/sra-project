public static void seperateCards() {
    PokerHand.inputLine = PokerHand.input.nextLine();
    for (int i = 0; i < (PokerHand.seperators.length); i++) {
        java.lang.String[] hand;
        hand = PokerHand.inputLine.split(PokerHand.seperators[i]);
        if ((hand.length) == 5) {
            PokerHand.cards = hand;
        }
    }
    if ((PokerHand.cards) == null) {
        PokerHand.invalid = true;
    }
}