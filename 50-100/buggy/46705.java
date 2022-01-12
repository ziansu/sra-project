public void addTrade(com.skilltradiez.skilltraderz.UserDatabase db, com.skilltradiez.skilltraderz.Trade trade) {
    if (trades.contains(trade.getTradeID()))
        return ;
    
    trades.add(trade.getTradeID());
    newTrades.add(trade.getTradeID());
    notifyDB();
}