public static int getPairs(java.util.ArrayList<Card> hand) {
    return 2 * (Scoring.getMultiples(hand, 2));
}