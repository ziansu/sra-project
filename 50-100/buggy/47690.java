private boolean checkSellOrdersLimit(mt.comm.ServerSideMessage msg) {
    int count = 0;
    java.util.Set<mt.Order> userOrders = orderMap.get(msg.getOrder().getNickname());
    for (mt.Order obj : userOrders) {
        if (obj.isSellOrder()) {
            count++;
        }
    }
    if (count < (MAX_SELL_ORDERS)) {
        return true;
    }else {
        return false;
    }
}