public boolean valsAreAllTheSame(java.util.Map<PokerPlayer, java.lang.Integer> m) {
    int count = 0;
    int firstVal = 0;
    for (java.util.Map.Entry<PokerPlayer, java.lang.Integer> entry : m.entrySet()) {
        count++;
        if (count == 1) {
            firstVal = entry.getValue();
            continue;
        }
        if ((entry.getValue()) != firstVal) {
            return false;
        }
    }
    return true;
}