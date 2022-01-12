private void prepareNavigationBarView() {
    mNavigationBarView.reorient();
    mNavigationBarView.setListeners(mRecentsClickListener, mRecentsPreloadOnTouchListener, mLongPressBackRecentsListener, mHomeActionListener, mLongPressHomeListener, mTorchClickListener, mCameraClickListener, mScreenShotClickListener, mImmersiveClickListener, mScreenClickListener, mKillClickListener);
    mAssistManager.onConfigurationChanged();
    if (forceReset) {
        int newVal = mSystemUiVisibility;
        mSystemUiVisibility = 0;
        setSystemUiVisibility(newVal, com.android.systemui.statusbar.phone.SYSTEM_UI_VISIBILITY_MASK);
        checkBarMode(mNavigationBarMode, mNavigationBarWindowState, mNavigationBarView.getBarTransitions(), mNoAnimationOnNextBarModeChange);
    }
}