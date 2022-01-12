public void addToTradeList(core.Trade trade, core.TradeSummary summary) {
    tradeList.add(trade);
    if (((trade.getTradeType().equals("B")) || (trade.getTradeType().equals("R"))) || (trade.getTradeType().equals("BONUS"))) {
        handleBuy(trade, summary);
    }
    if (trade.getTradeType().equals("S")) {
        handleSell(trade, true, summary);
    }
    print();
}