public com.qa.smurf.entities.Order getPlacedOrder(com.qa.smurf.entities.User user) {
    java.util.List<com.qa.smurf.entities.Order> orders = orderRepository.findByUser(user);
    for (com.qa.smurf.entities.Order o : orders) {
        if ((o.getOrderStatus()) == (com.qa.smurf.util.OrderStatus.PLACED)) {
            return o;
        }
    }
    return null;
}