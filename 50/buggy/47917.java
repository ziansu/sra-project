public double getBid(double currentBid, double lastBid) {
    bid.calculateBid(userStrategy, currentBid, lastBid, currentElectricity, dailyNeeds, unitBudget);
    return marketFramework.Snippet.round(bid.getAmount());
}