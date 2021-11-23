private void setUpPaymentMethods() {
    bindActivity();
    initRetryButton();
    setupToolbarTitle(false);
    setSupportActionBar(toolbar);
    bindDataToView();
    getPaymentPages();
}