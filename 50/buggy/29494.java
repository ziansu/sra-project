@java.lang.Override
public void onPurchaseHistoryRestored() {
    android.widget.Toast.makeText(this, "restore previous purchase", Toast.LENGTH_SHORT).show();
    ADS_REMOVED = isRemoveAdsPurchased();
}