public void changeState(com.nusclimb.live.crimp.hello.scan.ScanFragment.State state) {
    mState = state;
    updateUI();
    doWork();
}