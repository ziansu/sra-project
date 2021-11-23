public static void updateInventory(final org.onepf.opfiab.model.event.billing.InventoryResponse inventoryResponse) {
    final java.util.Map<org.onepf.opfiab.model.billing.Purchase, org.onepf.opfiab.verification.VerificationResult> inventory = inventoryResponse.getInventory();
    if (!(inventoryResponse.isSuccessful())) {
        return ;
    }
    if ((org.onepf.trivialdrive.TrivialBilling.getPurchase(inventory, org.onepf.trivialdrive.TrivialBilling.SKU_PREMIUM)) != null) {
        org.onepf.trivialdrive.TrivialBilling.premium = true;
    }
    final org.onepf.opfiab.model.billing.Purchase purchase = org.onepf.trivialdrive.TrivialBilling.getPurchase(inventory, org.onepf.trivialdrive.TrivialBilling.SKU_SUBSCRIPTION);
    if ((purchase != null) && (!(purchase.isCanceled()))) {
        org.onepf.trivialdrive.TrivialBilling.subscription = true;
    }
}