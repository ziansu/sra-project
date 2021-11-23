public static com.tpjad.project.entity.Product toProduct(com.tpjad.project.model.ProductModel productModel) {
    if (productModel == null) {
        return null;
    }
    com.tpjad.project.entity.Product product = new com.tpjad.project.entity.Product();
    product.setName(product.getName());
    product.setDescription(product.getDescription());
    product.setStock(product.getStock());
    return product;
}