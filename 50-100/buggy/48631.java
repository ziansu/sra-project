public static double SpendBudgetBid(double currentBid, double dailyNeeds, double unitBudget) {
    double bid = 0;
    double deficit = dailyNeeds;
    double budget = unitBudget * deficit;
    if (deficit > 0) {
        if (deficit < (budget / currentBid)) {
            bid = deficit;
        }else {
            bid = budget / currentBid;
        }
    }
    return bid;
}