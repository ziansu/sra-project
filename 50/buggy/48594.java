@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d(com.discflux.android.spotifystreamer.PlayFragment.LOG_TAG, "Activity Paused");
    mHandler.removeCallbacks(mUpdateTimeTask);
    if (mBound) {
        getActivity().unbindService(mConnection);
        mBound = false;
    }
}