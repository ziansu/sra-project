public boolean addTradeToQueue(us.textrade.models.Trade trade) {
    if (trade != null)
        return this.getTradesInQueue().add(trade);
    
    return false;
}