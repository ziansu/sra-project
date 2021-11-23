private boolean maxSellOrders(mt.Order o) throws mt.exception.ServerException {
    int i = 0;
    java.util.Set<mt.Order> orders = orderMap.get(o.getNickname());
    for (java.util.Iterator<mt.Order> it = orders.iterator(); it.hasNext();) {
        mt.Order order = it.next();
        if (order.isSellOrder())
            i++;
        
    }
    if (i == 5)
        return true;
    
    return false;
}