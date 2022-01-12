public void addProducts(int p) {
    for (int i = 0; i < (Main.producten.size()); i++) {
        if ((Main.producten.get(i).getId()) == p) {
            products.add(Main.producten.get(i));
        }
    }
}