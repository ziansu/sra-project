private void btnBearingBoxHandler() {
    logger.info("add order");
    openOrders.add("bearingBox");
    (this.uuid)++;
    Literal order = Literal.parseLiteral((("order(deliveredBearingBox, " + (this.uuid)) + ", false)[source(customer)]"));
    addPercept(this.leaderId, order);
}