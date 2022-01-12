public void insertUpdate(lu.domi.sapphire.minimarket.data.Product product, int quantity) {
    if (getCartService().contains(product.getArtNo())) {
        getCartService().updateEntry(product.getArtNo(), quantity);
    }else {
        getCartService().insertEntry(product, quantity);
    }
}