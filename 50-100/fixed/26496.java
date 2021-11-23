private static int findTargetLossIndex(java.util.ArrayList<java.lang.Float> nextXPrices, float close, float targetLoss) {
    float targetClose = (close * (100.0F - targetLoss)) / 100.0F;
    int listSize = nextXPrices.size();
    for (int a = listSize - 1; a >= 0; a--) {
        if ((nextXPrices.get(a)) <= targetClose) {
            return (listSize - 1) - a;
        }
    }
    return -1;
}