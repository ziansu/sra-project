private static int findTargetGainIndex(java.util.ArrayList<java.lang.Float> nextXPrices, float close, float targetGain) {
    float targetClose = (close * (100.0F + targetGain)) / 100.0F;
    int listSize = nextXPrices.size();
    for (int a = listSize - 1; a >= 0; a--) {
        if ((nextXPrices.get(a)) >= targetClose) {
            return (listSize - 1) - a;
        }
    }
    return -1;
}