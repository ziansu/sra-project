public void changeState(com.nusclimb.live.crimp.hello.scan.ScanFragment.State state) {
    if (DEBUG)
        android.util.Log.d(TAG, ((("Change state: " + (mState)) + " -> ") + state));
    
    mState = state;
    updateUI();
    doWork();
}