private static int findTopRank(Player player) {
    Card[] hand = player.getHand();
    for (int i = 0; i < (hand.length); i++) {
        if ((hand[i].isInPlay()) == true) {
            int rank = hand[i].checkRank();
            player.discard(hand[i]);
            return rank;
        }
    }
    return -2;
}