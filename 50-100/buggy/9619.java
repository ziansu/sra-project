@java.lang.Override
public void loadProducts(java.util.List<com.ariondan.vendor.model.ProductModel> productModels) {
    layoutCart.setVisibility(View.GONE);
    this.productModels.clear();
    cartModels.clear();
    populatePopup(productModels);
    for (com.ariondan.vendor.model.ProductModel product : productModels) {
        this.productModels.add(product);
        if ((gridProducts.getAdapter()) != null) {
            gridProducts.getAdapter().notifyDataSetChanged();
        }
    }
}