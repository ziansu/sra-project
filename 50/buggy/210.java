public com.amaiz.trendbar.model.Quote getQuote(com.amaiz.trendbar.model.Symbol symbol) {
    return new com.amaiz.trendbar.model.Quote(symbol, ((random.nextDouble()) * 100), java.lang.System.currentTimeMillis());
}