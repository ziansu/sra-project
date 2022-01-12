@android.support.annotation.Nullable
private com.anjlab.android.iab.v3.TransactionDetails getPurchaseTransactionDetails(java.lang.String productId, com.anjlab.android.iab.v3.BillingCache cache) {
    com.anjlab.android.iab.v3.PurchaseInfo details = cache.getDetails(productId);
    if ((details != null) && (!(android.text.TextUtils.isEmpty(details.responseData)))) {
        try {
            return new com.anjlab.android.iab.v3.TransactionDetails(details);
        } catch (org.json.JSONException e) {
            android.util.Log.e(com.anjlab.android.iab.v3.BillingProcessor.LOG_TAG, ("Failed to load saved purchase details for " + productId), e);
        }
    }
    return null;
}