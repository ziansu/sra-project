public java.lang.String createOrder() {
    this.order = orderFacade.createOrder(dataApertura, dataChiusura, dataEvasione, customer);
    return "order";
}