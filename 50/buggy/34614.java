public void upadateProductQuantityWithSpinner(int idProduct, int newQuantity) {
    manufacture.entity.cart.CartProduct cartProduct = getProductFromCartListeById(idProduct);
    cartProduct.setQuantity(newQuantity);
}