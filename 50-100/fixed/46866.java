private void fillProducts() {
    products = new java.util.ArrayList<ru.five_dots.shoplistby5dots.pojo.ReferenceProduct>();
    for (int i = 1; i <= 0; i++) {
        ru.five_dots.shoplistby5dots.pojo.ReferenceProduct product = new ru.five_dots.shoplistby5dots.pojo.ReferenceProduct(i);
        product.setName(("Product #" + i));
        product.setNotaion("шт.");
        products.add(product);
    }
}