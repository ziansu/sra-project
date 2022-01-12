public static boolean isCollision(Card[] cards) {
    for (int i = 0; i < ((cards.length) - 1); i++) {
        for (int j = i + 1; j < (cards.length); j++) {
            if ((cards[i].index) == (cards[j].index)) {
                return true;
            }
        }
    }
    return false;
}