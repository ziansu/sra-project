public int getNewProductIdByCategory(java.lang.String categoryId) {
    java.util.ArrayList<sg.edu.nus.iss.universitysouvenirstore.Product> p = this.getProductListByCategory(categoryId);
    int largest = 0;
    for (sg.edu.nus.iss.universitysouvenirstore.Product product : p) {
        java.lang.String[] splitString = product.getProductId().split("/");
        int splitProductId = java.lang.Integer.parseInt(splitString[1]);
        if (largest <= splitProductId) {
            largest = splitProductId;
        }
    }
    return largest + 1;
}