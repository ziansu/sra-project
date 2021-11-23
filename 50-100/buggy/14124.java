private com.kricko.model.email.TemplateOrder buildEmailOrder(com.kricko.constants.EmailType type, com.kricko.domain.Orders orders) {
    LOGGER.info("Building Email Order");
    com.kricko.model.email.TemplateOrder order = new com.kricko.model.email.TemplateOrder();
    java.util.List<com.kricko.domain.OrderPart> orderParts = orders.getOrderParts();
    java.util.List<com.kricko.model.email.TemplateOrderPart> tmplOrderParts = convertOrderParts(orderParts);
    if (!(tmplOrderParts.isEmpty())) {
        LOGGER.debug("Template Order Parts is not empty");
        order.setOrderParts(tmplOrderParts);
        return order;
    }
    return null;
}