public java.lang.String createOrder() {
    this.order = orderFacade.createOrder(dataApertura, customer);
    return "order";
}