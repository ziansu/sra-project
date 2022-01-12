public double getBid(double currentBid, double lastBid) {
    bid.calculateBid(currentBid, lastBid, this);
    return marketFramework.Snippet.round(bid.getAmount());
}