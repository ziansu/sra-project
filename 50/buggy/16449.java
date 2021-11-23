@java.lang.Override
public void purchase(java.lang.String sku, boolean isConsumable) {
    if ((listener()) != null)
        listener().onPrePurchase();
    
    super.purchase(sku, isConsumable);
    com.amazon.device.iap.PurchasingService.purchase(sku);
}