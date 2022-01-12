@java.lang.Override
protected void enableEditMode() {
    super.enableEditMode();
    if ((product.productType) == (com.go.kchin.model.database.Product.PRODUCT_TYPE_MADE_ON_SALE)) {
        btnProductRemaining.setEnabled(false);
    }
    btnEdit.setVisibility(View.GONE);
}