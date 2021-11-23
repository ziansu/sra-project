public com.tess.entities.CarOrder getUserOrder(java.lang.Long id, java.lang.String username) {
    com.tess.entities.CarOrder order = orderRepository.read(id);
    if ((order != null) && (order.getUser().getUsername().equals(username))) {
        return order;
    }else {
        throw new com.tess.exceptions.OrderNotFoundException();
    }
}