private uk.ac.glasgow.jagora.Market getMarket(uk.ac.glasgow.jagora.Stock stock) {
    uk.ac.glasgow.jagora.Market market = markets.get(stock);
    if (market == null) {
        market = new uk.ac.glasgow.jagora.impl.ContinuousOrderDrivenMarket(stock, world);
        markets.put(stock, market);
    }
    return market;
}