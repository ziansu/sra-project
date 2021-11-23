private void cleanUpOrderOrder(final org.scenarioo.example.e4.domain.Order order) {
    org.scenarioo.example.e4.dto.OrderPositionsTreeviewDTO orderPositions = cachedPositions.remove(order.getId());
    for (org.scenarioo.example.e4.domain.Position position : orderPositions.getOrderPositions().getPositions()) {
        parentOrders.remove(position.getId());
    }
}