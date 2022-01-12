public static double SpendBudgetBid(double currentBid, double dailyNeeds, double budget) {
    double bid = 0;
    double deficit = dailyNeeds;
    if (deficit > 0) {
        if (deficit < (budget / currentBid)) {
            bid = deficit;
        }else {
            bid = budget / currentBid;
        }
    }
    return bid;
}