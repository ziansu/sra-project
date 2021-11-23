public void setProductListener(final de.handler.mobile.android.fairmondo.data.interfaces.OnSearchResultListener productListener) {
    this.productListener = productListener;
    errorHandler.setListener(productListener);
}