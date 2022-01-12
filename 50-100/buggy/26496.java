private static int findTargetLossIndex(java.util.ArrayList<java.lang.Float> nextXPrices, float close, float targetLoss) {
    float targetClose = (close * (100.0F - targetLoss)) / 100.0F;
    int listSize = nextXPrices.size();
    for (int a = 0; a < listSize; a++) {
        if ((nextXPrices.get(a)) <= targetClose) {
            return a;
        }
    }
    return -1;
}