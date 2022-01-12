android.view.View enterFullScreen() {
    assert !(isFullScreen());
    onDetachedFromWindow();
    org.chromium.android_webview.FullScreenView fullScreenView = new org.chromium.android_webview.FullScreenView(mContext, mAwViewMethods);
    mFullScreenTransitionsState.enterFullScreen(fullScreenView);
    mAwViewMethods = new org.chromium.android_webview.NullAwViewMethods(this, mInternalAccessAdapter, mContainerView);
    mContainerView.removeOnLayoutChangeListener(mLayoutChangeListener);
    fullScreenView.addOnLayoutChangeListener(mLayoutChangeListener);
    setInternalAccessAdapter(fullScreenView.getInternalAccessAdapter());
    setContainerView(fullScreenView);
    return fullScreenView;
}