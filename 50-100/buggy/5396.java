private void initializeCatalog() {
    Products.ProductReader productReader;
    try {
        productReader = new Products.ProductReader(readFile(productPath));
        productCatalog = productReader.getProducts();
        for (Products.ProductSpecification p : productCatalog) {
            java.lang.System.out.println(p.getProductUPC());
        }
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(POST.POST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}