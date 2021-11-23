@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (co.smartreceipts.android.BuildConfig.DEBUG) {
        android.util.Log.d(co.smartreceipts.android.fragments.ReceiptsFragment.TAG, "onCreate");
    }
    setHasOptionsMenu(true);
    mCurrentTrip = getArguments().getParcelable(Trip.PARCEL_KEY);
}