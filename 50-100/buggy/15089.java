public com.qa.smurf.entities.Order getPlacedOrder(com.qa.smurf.entities.User user) {
    java.util.List<com.qa.smurf.entities.Order> orders = orderRepository.findByUser(user);
    java.lang.System.out.println(("Orders Size" + (orders.size())));
    for (com.qa.smurf.entities.Order o : orders) {
        if ((o.getOrderStatus()) == (com.qa.smurf.util.OrderStatus.PLACED)) {
            java.lang.System.out.println("order found");
            return o;
        }
    }
    return null;
}