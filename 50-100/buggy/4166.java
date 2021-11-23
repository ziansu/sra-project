public void incrementProductQuantity(int idProduct) {
    manufacture.entity.cart.CartProduct cartProduct = getProductFromCartListeById(idProduct);
    int cartProductQuantity = cartProduct.getQuantity();
    if (cartProductQuantity < (cartProduct.getProduct().getStock())) {
        cartProductQuantity++;
    }else {
        cartProductQuantity = cartProduct.getProduct().getStock();
    }
    cartProduct.setQuantity(cartProductQuantity);
}