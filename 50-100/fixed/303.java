public com.kodilla.good.patterns.challenges.challenge2.orders.ProductOrderDto process(com.kodilla.good.patterns.challenges.challenge2.orders.ProductOrderRequest orderRequest) {
    boolean isOrdered = productOrderService.orderProduct(orderRequest);
    if (isOrdered) {
        informationService.inform(orderRequest.getUser());
        productOrderRepository.createOrder(orderRequest, java.time.LocalDate.now());
        return new com.kodilla.good.patterns.challenges.challenge2.orders.ProductOrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
    }else {
        return new com.kodilla.good.patterns.challenges.challenge2.orders.ProductOrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
    }
}