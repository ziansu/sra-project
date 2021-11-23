public static java.lang.String OrderTypeToBitMarketOrderType(com.xeiam.xchange.dto.Order.OrderType orderType) {
    return orderType == (Order.OrderType.ASK) ? "sell" : "buy";
}