public java.util.List<pekl.gasqueue.com.gasqueue.Product> getProductsSameCategory() {
    productsSameCategory = new java.util.ArrayList<>();
    for (int i = 0; i < (allProducts.size()); i++) {
        if (allProducts.get(i).getCategory().equals(pekl.gasqueue.com.gasqueue.Menu.chosenCategory))
            productsSameCategory.add(allProducts.get(i));
        
    }
    return productsSameCategory;
}