void incrementalMountComponent() {
    com.facebook.litho.ThreadUtils.assertMainThread();
    if (!(mIncrementalMountEnabled)) {
        throw new java.lang.IllegalStateException(("Calling incrementalMountComponent() but incremental mount" + " is not enabled"));
    }
    if (((mLithoView) == null) || (mLithoView.doesOwnIncrementalMount())) {
        return ;
    }
    final android.graphics.Rect currentVisibleArea = com.facebook.litho.ComponentsPools.acquireRect();
    if (getVisibleRect(currentVisibleArea)) {
        mountComponent(currentVisibleArea, true);
    }
    com.facebook.litho.ComponentsPools.release(currentVisibleArea);
}