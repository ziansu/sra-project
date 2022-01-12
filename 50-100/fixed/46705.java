public void addTrade(com.skilltradiez.skilltraderz.UserDatabase db, com.skilltradiez.skilltraderz.Trade trade) {
    if (trade == null)
        return ;
    
    if (trades.contains(trade.getTradeID()))
        return ;
    
    trades.add(trade.getTradeID());
    newTrades.add(trade.getTradeID());
    notifyDB();
}