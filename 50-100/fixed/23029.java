private static boolean checkInPlay(Player player) {
    Card[] hand = player.getHand();
    for (int i = 0; i < (hand.length); i++) {
        if ((hand[i]) != null) {
            if ((hand[i].isInPlay()) == true) {
                return true;
            }
        }
    }
    return false;
}