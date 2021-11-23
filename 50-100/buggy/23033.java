public java.util.Set<com.sbu.data.entitys.Order> getOrders(java.lang.Iterable<java.lang.String> orderIds) {
    java.util.Set<com.sbu.data.entitys.Order> orders = new java.util.HashSet<>();
    for (java.lang.String orderid : orderIds) {
        orders.add(orderRepository.findOne(java.lang.Integer.parseInt(orderid)));
    }
    return orders;
}