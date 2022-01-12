public int getQuanity(com.qac.sparkle_gardens.entities.Product p) {
    com.qac.sparkle_gardens.entities.Order order = repository.getOrder(1);
    for (com.qac.sparkle_gardens.entities.OrderLine orderline : order.getOrderLines()) {
        if (orderline.getProduct().equals(p))
            return orderline.getQuantity();
        
    }
    return 0;
    return 0;
}