public java.util.List<pekl.gasqueue.com.gasqueue.Product> getProductsSameCategory() {
    productsSameCategory = new java.util.ArrayList<>();
    if (pekl.gasqueue.com.gasqueue.Menu.chosenCategory.equals(null)) {
        java.lang.System.out.println("välja en jävla categoryrå");
    }else {
        for (int i = 0; i < (allProducts.size()); i++) {
            if (allProducts.get(i).getCategory().equals(pekl.gasqueue.com.gasqueue.Menu.chosenCategory))
                productsSameCategory.add(allProducts.get(i));
            
        }
    }
    return productsSameCategory;
}