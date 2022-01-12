public static void updateInventory(final org.onepf.opfiab.model.event.billing.InventoryResponse inventoryResponse) {
    final java.util.Map<org.onepf.opfiab.model.billing.Purchase, org.onepf.opfiab.verification.VerificationResult> inventory = inventoryResponse.getInventory();
    if (!(inventoryResponse.isSuccessful())) {
        return ;
    }
    org.onepf.trivialdrive.TrivialBilling.premium = (org.onepf.trivialdrive.TrivialBilling.getPurchase(inventory, org.onepf.trivialdrive.TrivialBilling.SKU_PREMIUM)) != null;
    final org.onepf.opfiab.model.billing.Purchase purchase = org.onepf.trivialdrive.TrivialBilling.getPurchase(inventory, org.onepf.trivialdrive.TrivialBilling.SKU_SUBSCRIPTION);
    org.onepf.trivialdrive.TrivialBilling.subscription = (purchase != null) && (!(purchase.isCanceled()));
}