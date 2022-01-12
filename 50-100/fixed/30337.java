@java.lang.Override
public void onPurchasesUpdated(java.util.List<com.android.billingclient.api.Purchase> purchases) {
    for (com.android.billingclient.api.Purchase purchase : purchases) {
        switch (purchase.getSku()) {
            case "premium" :
                mPremiumUnlocked = true;
                savePremiumUnlocked();
                android.widget.Toast.makeText(this, getResources().getString(R.string.premium_congrats), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}