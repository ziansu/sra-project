@java.lang.Override
public void fetchInventory(java.util.ArrayList<java.lang.String> sku) {
    java.util.Set<java.lang.String> skuList = new java.util.HashSet<>();
    skuList.addAll(sku);
    com.amazon.device.iap.PurchasingService.getProductData(skuList);
}