public void consumeAsync(com.sandbox.IAPHelper.Purchase purchase) throws com.sandbox.IAPHelper.IabAsyncInProgressException {
    check_not_disposed();
    check_setup_done("consume");
    consumeAsyncInternal(purchase);
}