public static void goForChans(Scorecard card, Hand hand) {
    for (Dice dice : hand.getDices()) {
        if ((dice.faceValue) < 4) {
            dice.throwDice();
        }
    }
    for (Dice dice : hand.getDices()) {
        if ((dice.faceValue) < 4) {
            dice.throwDice();
        }
    }
    card.categories[Scorecard.chance] = AI.chansScore(hand.getHandArray());
}