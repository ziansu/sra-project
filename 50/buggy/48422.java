@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.d(com.mmm.parq.fragments.DriverHomeFragment.TAG, "in HomeFragment onStart");
    if ((mState) != null) {
        setOverlayFragment();
    }
}