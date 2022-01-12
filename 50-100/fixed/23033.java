public java.util.Set<com.sbu.data.entitys.Order> getOrders(java.lang.Iterable<java.lang.Integer> orderIds) {
    java.util.Set<com.sbu.data.entitys.Order> orders = new java.util.HashSet<>();
    for (int orderid : orderIds) {
        orders.add(orderRepository.findOne(orderid));
    }
    return orders;
}