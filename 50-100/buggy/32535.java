@java.lang.Override
public void onPurchaseSuccess(@android.support.annotation.NonNull
co.smartreceipts.android.purchases.model.InAppPurchase inAppPurchase, @android.support.annotation.NonNull
co.smartreceipts.android.purchases.source.PurchaseSource purchaseSource, @android.support.annotation.NonNull
co.smartreceipts.android.purchases.wallet.PurchaseWallet updatedPurchaseWallet) {
    if (inAppPurchase == (co.smartreceipts.android.purchases.model.InAppPurchase.OcrScans50)) {
        final co.smartreceipts.android.purchases.model.ManagedProduct managedProduct = purchaseWallet.getManagedProduct(InAppPurchase.OcrScans50);
        com.google.common.base.Preconditions.checkArgument((managedProduct instanceof co.smartreceipts.android.purchases.model.ConsumablePurchase), "OcrScans50 must be a ConsumablePurchase");
        uploadOcrPurchase(((co.smartreceipts.android.purchases.model.ConsumablePurchase) (managedProduct)));
    }
}