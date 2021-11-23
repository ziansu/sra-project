public void setFakeboxDelegate(org.chromium.chrome.browser.ntp.NewTabPage.FakeboxDelegate fakeboxDelegate) {
    mFakeboxDelegate = fakeboxDelegate;
    if ((mFakeboxDelegate) != null) {
        mNewTabPageView.updateVoiceSearchButtonVisibility();
        mNewTabPageView.setUrlFocusChangeAnimationPercent((fakeboxDelegate.isUrlBarFocused() ? 1.0F : 0.0F));
    }
}