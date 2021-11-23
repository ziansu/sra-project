public static com.tpjad.project.entity.Product toProduct(com.tpjad.project.model.ProductModel productModel) {
    if (productModel == null) {
        return null;
    }
    com.tpjad.project.entity.Product product = new com.tpjad.project.entity.Product();
    product.setName(productModel.getName());
    product.setDescription(productModel.getDescription());
    product.setStock(productModel.getStock());
    return product;
}