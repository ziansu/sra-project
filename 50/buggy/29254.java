@java.lang.Override
public void onDestroy() {
    if (co.smartreceipts.android.BuildConfig.DEBUG) {
        android.util.Log.d(co.smartreceipts.android.fragments.TripFragment.TAG, "onDestroy");
    }
    getPersistenceManager().getDatabase().unregisterTripRowListener(this);
    super.onDestroy();
}