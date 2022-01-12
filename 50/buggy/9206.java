private void firePurchase(java.lang.String sku, com.idkjava.thelements.error.ErrorHandler handler) {
    com.idkjava.thelements.money.ProductManager mProductManager = com.idkjava.thelements.ElementsApplication.getProductManager();
    mProductManager.bindErrorHandler(handler);
    mProductManager.launchPurchase(this, sku);
}