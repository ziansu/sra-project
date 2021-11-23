public static void clear(int id) {
    models.Cart cart = models.Cart.getCart(id);
    cart.productList.clear();
    cart.checkout = 0;
    cart.size = 0;
}