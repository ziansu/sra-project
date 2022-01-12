public int getValue() {
    int totalValue = 0;
    for (int x = 0; x < (hand.size()); x++) {
        totalValue += hand.get(x).getRank().getValue();
    }
    return totalValue;
}