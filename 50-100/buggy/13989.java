@java.lang.Override
public void purchase(final java.lang.String sku, boolean isConsumable) {
    if ((listener()) != null)
        listener().onPrePurchase();
    
    super.purchase(sku, isConsumable);
    activityCheckout.whenReady(new org.solovyev.android.checkout.Checkout.ListenerAdapter() {
        @java.lang.Override
        public void onReady(org.solovyev.android.checkout.BillingRequests requests) {
            requests.purchase(ProductTypes.IN_APP, sku, null, activityCheckout.getPurchaseFlow());
        }
    });
}