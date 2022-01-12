@java.lang.Override
public java.util.List<com.isolutions4u.onlineshopping.model.Product> findProductByCategoryId(java.lang.Integer categoryId) {
    java.util.List<com.isolutions4u.onlineshopping.model.Product> products = new java.util.ArrayList<>();
    java.util.List<com.isolutions4u.onlineshopping.model.Product> productsCopy = new java.util.ArrayList<>();
    productRepository.findProductByCategoryId(categoryId).forEach(products::add);
    productsCopy.addAll(products);
    for (com.isolutions4u.onlineshopping.model.Product p : products) {
        if (!(p.isActive())) {
            productsCopy.remove(p);
        }
    }
    return productsCopy;
}