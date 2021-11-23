public static Order.OrderType BitMarketOrderTypeToOrderType(java.lang.String bitmarketOrderType) {
    return bitmarketOrderType.equals("buy") ? Order.OrderType.ASK : Order.OrderType.BID;
}