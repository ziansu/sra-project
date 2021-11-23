public void setFakeboxDelegate(org.chromium.chrome.browser.ntp.NewTabPage.FakeboxDelegate fakeboxDelegate) {
    mFakeboxDelegate = fakeboxDelegate;
    if ((mFakeboxDelegate) != null) {
        mNewTabPageView.updateVoiceSearchButtonVisibility();
        if (fakeboxDelegate.isUrlBarFocused()) {
            mNewTabPageView.setUrlFocusChangeAnimationPercent(1.0F);
        }
    }
}