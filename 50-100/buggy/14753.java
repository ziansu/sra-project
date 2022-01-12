public boolean dismiss(android.view.View tipView, boolean byUser, long startDelay) {
    if (tipView == null) {
        return false;
    }
    int key = ((int) (tipView.getTag()));
    if ((mTipsMap.containsKey(key)) && (isVisible(tipView))) {
        mTipsMap.remove(key);
        animateDismiss(tipView, byUser, startDelay);
        return true;
    }
    return false;
}