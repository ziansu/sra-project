private void maxSellOrders(mt.Order o) throws mt.exception.ServerException {
    int i = 0;
    java.util.Set<mt.Order> orders = orderMap.get(o.getNickname());
    for (java.util.Iterator<mt.Order> it = orders.iterator(); it.hasNext();) {
        mt.Order order = it.next();
        if (order.isSellOrder())
            i++;
        
    }
    if (i == 5)
        throw new mt.exception.ServerException("You can't have more than 5 unfilled orders");
    
}