protected void sendResult(int resultCode) {
    if ((this.getTargetFragment()) == null)
        return ;
    
    android.content.Intent data = new android.content.Intent();
    data.putExtra(ProductOptionFragment.EXTRA_PRODUCT_OPTION_VALUE_CODE, mSelectedOptionValue);
    this.getTargetFragment().onActivityResult(com.example.andy.store.catalog.ProductOptionDialogFragment.REQUEST_OPTION, resultCode, data);
}