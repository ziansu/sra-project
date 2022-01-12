private void recordScrollDistance() {
    if ((headerLayoutParams.height) >= (heightOfActionBar)) {
        mRecordDistance = ((int) (((headerLayoutParams.height) - (heightOfHeader)) * (client.example.sj.pulltoscaleheaderlayout.PullToScaleHeaderLayout.FRICTION)));
    }
}