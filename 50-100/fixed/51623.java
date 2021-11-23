private int checkHand(Card toCheck) {
    for (int i = 0; i < (playerHand.length); i++) {
        if ((playerHand[i]) != null) {
            if (playerHand[i].cardName.equals(toCheck.cardName)) {
                return i;
            }
        }
    }
    return -1;
}