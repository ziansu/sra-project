public boolean dispatchTrackballEvent(android.view.MotionEvent ev) {
    boolean ret = super.dispatchTrackballEvent(ev);
    if ((mPluginActivity) != null) {
        mPluginActivity.dispatchTrackballEvent(ev);
    }
    return ret;
}