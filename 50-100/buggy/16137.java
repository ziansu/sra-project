private void updateOnStoppingLocationUpdates() {
    android.util.Log.i(com.dknutsonlaw.android.runtracker2.RunFragment.TAG, "Reached updateOnStoppingLocationUpdates");
    mStartButton.setEnabled((!(mRunManager.isTrackingRun(com.dknutsonlaw.android.runtracker2.RunFragment.sAppContext))));
    mStopButton.setEnabled(((mRunManager.isTrackingRun(com.dknutsonlaw.android.runtracker2.RunFragment.sAppContext)) && (mRunManager.isTrackingRun(mRun))));
    android.util.Log.i(com.dknutsonlaw.android.runtracker2.RunFragment.TAG, ((("mStartButton enabled? " + (mStartButton.isEnabled())) + " mStopButton enabled? ") + (mStopButton.isEnabled())));
    getActivity().invalidateOptionsMenu();
}