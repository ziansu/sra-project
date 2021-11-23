@java.lang.Override
public void onStop() {
    if (mIntentDataProvider.isOpenedByBrowser()) {
        createHerbResultIntent(org.chromium.chrome.browser.customtabs.CustomTabActivity.RESULT_STOPPED);
        finish();
    }
    super.onStop();
    org.chromium.chrome.browser.customtabs.CustomTabsConnection.getInstance(getApplication()).dontKeepAliveForSession(mIntentDataProvider.getSession());
}