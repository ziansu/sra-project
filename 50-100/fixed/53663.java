@java.lang.Override
public void preInflationStartup() {
    super.preInflationStartup();
    mPartnerBrowserRefreshNeeded = !(org.chromium.chrome.browser.partnercustomizations.PartnerBrowserCustomizations.isInitialized());
    org.chromium.chrome.browser.ApplicationInitialization.enableFullscreenFlags(getResources(), this, getControlContainerHeightResource());
    getWindow().setBackgroundDrawable(getBackgroundDrawable());
    mWindowAndroid = ((org.chromium.chrome.browser.ChromeApplication) (getApplicationContext())).createActivityWindowAndroid(this);
    mWindowAndroid.restoreInstanceState(getSavedInstanceState());
}