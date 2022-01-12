public static boolean isTenaliPresent(int[] hand) {
    int consecutives = 1;
    for (int idx = 1; idx < (CARDS_IN_HAND); idx++) {
        if ((hand[idx]) == (hand[(idx - 1)])) {
            consecutives += 1;
        }else {
            consecutives = 1;
        }
        if (consecutives > 2) {
            return true;
        }
    }
    return false;
}