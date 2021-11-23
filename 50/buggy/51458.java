public double calculateCashToPay(int loyalPointsUsed, double finalAmount) {
    double cash;
    cash = convertPointsToCash(loyalPointsUsed);
    int maxPoints = maxNumberOfPointsForAmount(finalAmount);
    if (maxPoints < loyalPointsUsed) {
    }
    return finalAmount - cash;
}