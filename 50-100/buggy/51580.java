private void onDrawerScrollEnded(float value) {
    float deltaDistance = java.lang.Math.abs((value - (mBaseAxisValue)));
    boolean willBounceBack = shouldBounceBack(deltaDistance);
    if (mExpanded) {
        if (willBounceBack) {
            setsetDrawerOpen(true);
        }else {
            setDrawerClosed(true);
        }
    }else {
        if (willBounceBack) {
            setDrawerClosed(true);
        }else {
            setsetDrawerOpen(true);
        }
    }
}