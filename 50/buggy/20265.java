private com.tr.analytics.sage.akka.data.CalcResult<com.tr.analytics.sage.akka.RicStore.Trades> makeTrades(int id) {
    return new com.tr.analytics.sage.akka.data.CalcResult(id, new com.tr.analytics.sage.akka.RicStore.Trades(trades, nextSlot));
}