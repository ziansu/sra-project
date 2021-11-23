public static double getMaxPrice(germes.utils.StockHistory history, germes.utils.StockBarPriceType priceType) {
    switch (priceType) {
        case CLOSE :
            return germes.utils.TradeUtils.maxClosePrice(history);
        case LOW :
            return germes.utils.TradeUtils.maxMinPrice(history);
        case HIGH :
            return germes.utils.TradeUtils.maxMaxPrice(history);
        case OPEN :
            return germes.utils.TradeUtils.maxOpenPrice(history);
        default :
            throw new java.lang.UnsupportedOperationException("Unknown priceType type");
    }
}