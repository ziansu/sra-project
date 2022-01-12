public java.lang.String addProductToCart(it.uniroma3.model.Orders cart, it.uniroma3.model.Product product) {
    java.lang.System.out.println((("trying to add " + (this.quantity)) + " Product to Cart"));
    java.lang.System.out.println(cart.toString());
    orderFacade.addProductToCart(cart, product, this.quantity);
    java.lang.System.out.println("Product added to Cart");
    return "cart?faces-redirect=true";
}