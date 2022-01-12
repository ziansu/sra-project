public com.coastcapitalsavings.mvc.models.Category postNewCategry(java.lang.String code, java.lang.String description, java.lang.String[] products) {
    com.coastcapitalsavings.mvc.models.Category cat = new com.coastcapitalsavings.mvc.models.Category();
    cat.setCode(code);
    cat.setDescription(description);
    com.coastcapitalsavings.mvc.models.Category postedCategory = categoryRepo.postNewCategory(cat);
    for (java.lang.String product : products) {
        productRepo.addProductToCategory(product, postedCategory.getCode());
    }
    java.util.List<com.coastcapitalsavings.mvc.models.Product> catProducts = productRepo.getProductsInCategoryByCategoryCode(cat.getCode());
    postedCategory.setProducts(catProducts);
    return postedCategory;
}