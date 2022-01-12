@java.lang.Override
public void onPause() {
    android.util.Log.d(co.smartreceipts.android.fragments.TripFragment.TAG, "onPause");
    if ((mNameAutoCompleteAdapter) != null) {
        mNameAutoCompleteAdapter.onPause();
    }
    if ((mCostCenterAutoCompleteAdapter) != null) {
        mCostCenterAutoCompleteAdapter.onPause();
    }
    super.onPause();
}