public boolean hasPermissionToAccess(java.lang.String productName) {
    com.softserve.if072.common.model.Product product = productDAO.getProductByName(productName);
    if (product == null) {
        return true;
    }else {
        return ((product != null) && ((product.getUser()) != null)) && ((product.getUser().getId()) == (getCurrentUser().getId()));
    }
}