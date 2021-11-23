@java.lang.Override
public void onPause() {
    if (co.smartreceipts.android.BuildConfig.DEBUG) {
        android.util.Log.d(co.smartreceipts.android.fragments.ReceiptsFragment.TAG, "onPause");
    }
    super.onPause();
    getPersistenceManager().getDatabase().unregisterReceiptRowListener();
}