public boolean hasPermissionToAccess(int productId) {
    int productOwnerId = productService.getUserIdByProductId(productId);
    return (productService.getUserIdByProductId(productId)) == (getCurrentUser().getId());
}