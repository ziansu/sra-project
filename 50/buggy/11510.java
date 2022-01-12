public double getSubTotalPrice(int idProduct) {
    double subTotalPrice = 0;
    manufacture.entity.cart.CartProduct cartProduct = getProductFromCartListeById(idProduct);
    subTotalPrice = (cartProduct.getProduct().getPrice()) * (cartProduct.getQuantity());
    return subTotalPrice;
}