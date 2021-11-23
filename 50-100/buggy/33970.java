@org.junit.Test
public void addTest() {
    final es.supermarket.comparator.api.Products products = productsFactory.createProducts();
    es.supermarket.comparator.api.Product product_one = productFactory.createProduct("product_one");
    org.junit.Assert.assertEquals("Checking addTest(), initial size", products.getAll().size(), 0);
    products.add(product_one);
    org.junit.Assert.assertEquals("Checking add(), size after addition", products.getAll().size(), 1);
    org.junit.Assert.assertEquals("Checking add(), product added", products.getById(0).getName(), "product_one");
}