private void btnBearingBoxHandler() {
    logger.info("add order");
    openOrders.add("bearingBox");
    (this.uuid)++;
    Literal order = Literal.parseLiteral((("order(deliveredBearingBox, " + (this.uuid)) + ", false)[source(customer)]"));
    java.lang.System.out.println(this.leaderId);
    addPercept(this.leaderId, order);
}