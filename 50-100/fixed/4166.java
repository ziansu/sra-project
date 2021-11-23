public void incrementProductQuantity(manufacture.entity.cart.CartProduct cartProduct) {
    int cartProductQuantity = cartProduct.getQuantity();
    if (cartProductQuantity < (cartProduct.getProduct().getStock())) {
        cartProductQuantity++;
    }else {
        cartProductQuantity = cartProduct.getProduct().getStock();
    }
    cartProduct.setQuantity(cartProductQuantity);
}