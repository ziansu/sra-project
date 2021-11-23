private static int findTargetGainIndex(java.util.ArrayList<java.lang.Float> nextXPrices, float close, float targetGain) {
    float targetClose = (close * (100.0F + targetGain)) / 100.0F;
    int listSize = nextXPrices.size();
    for (int a = 0; a < listSize; a++) {
        if ((nextXPrices.get(a)) >= targetClose) {
            return a;
        }
    }
    return -1;
}