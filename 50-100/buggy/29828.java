private int roundToNearestHundred(int amount) {
    int scaledAmountInt = ((int) (amount * 1.1F));
    if ((scaledAmountInt % 100) <= 50) {
        scaledAmountInt = scaledAmountInt / 100;
        scaledAmountInt = scaledAmountInt * 100;
    }else {
        scaledAmountInt = scaledAmountInt / 100;
        scaledAmountInt = scaledAmountInt * 100;
        scaledAmountInt += scaledAmountInt;
    }
    return scaledAmountInt;
}