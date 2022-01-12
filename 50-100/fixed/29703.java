@java.lang.Override
public lv.javaguru.java2.domain.Order register(java.lang.Integer productID, java.lang.String mail, java.lang.Integer quantity, java.lang.Integer prodpackID) {
    orderValidator.validate(productID, quantity, prodpackID);
    lv.javaguru.java2.domain.Order order = lv.javaguru.java2.domain.OrderBuilder.createOrder().withProductID(productID).withMail(mail).withQuantity(quantity).build().withProdpackID;
    return orderDAO.save(order);
}