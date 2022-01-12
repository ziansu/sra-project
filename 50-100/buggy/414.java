public void addItemToServer(java.util.Map<java.lang.String, ?> product) {
    if (product != null) {
        java.lang.String id = ((java.lang.String) (product.get("productId")));
        mref.child(id).setValue(product);
        mref.updateChildren(((java.util.Map<java.lang.String, java.lang.Object>) (product)));
    }
}