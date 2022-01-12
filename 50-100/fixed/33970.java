@org.junit.Test
public void addTest() {
    final es.supermarket.comparator.api.Products products = productsFactory.createProducts();
    final es.supermarket.comparator.api.Product product_one = productFactory.createProduct("product_one");
    products.add(product_one);
    org.junit.Assert.assertEquals("Checking add(), product added", products.getById(0).getName(), "product_one");
}