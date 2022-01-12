public static void addTrade(com.skilltradiez.skilltraderz.Trade trade) {
    java.util.Set<com.skilltradiez.skilltraderz.Trade> trades = com.skilltradiez.skilltraderz.MasterController.getUserDB().getTrades();
    trades.add(trade);
    com.skilltradiez.skilltraderz.MasterController.getUserDB().getChangeList().add(trade);
    try {
        com.skilltradiez.skilltraderz.MasterController.getUserDB().getElastic().addDocument("trade", trade.getTradeID().toString(), trade);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}