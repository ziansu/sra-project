@java.lang.Override
public void onStop() {
    super.onStop();
    mHomepageManager.setPrefHomepageCustomUri(org.chromium.chrome.browser.UrlUtilities.fixUrl(org.chromium.chrome.browser.UrlUtilities.fixupUrl(mCustomUriCache)));
}