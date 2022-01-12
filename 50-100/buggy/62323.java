@java.lang.Override
public void onPause() {
    if (co.smartreceipts.android.BuildConfig.DEBUG) {
        android.util.Log.d(co.smartreceipts.android.fragments.TripFragment.TAG, "onPause");
    }
    if ((mNameAutoCompleteAdapter) != null) {
        mNameAutoCompleteAdapter.onPause();
    }
    if ((mCostCenterAutoCompleteAdapter) != null) {
        mCostCenterAutoCompleteAdapter.onPause();
    }
    super.onPause();
}