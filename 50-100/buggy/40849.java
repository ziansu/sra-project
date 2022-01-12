private boolean isExpire(com.joenee.common.model.User user) {
    java.util.List<com.joenee.common.model.Product> list = productService.selectList(null);
    boolean isExpire = true;
    for (com.joenee.common.model.Product product : list) {
        if (customService.queryProductIsExpire(product.getId(), user.getId())) {
            return false;
        }else {
            isExpire = false;
        }
    }
    return isExpire;
}