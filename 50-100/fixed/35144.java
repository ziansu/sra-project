private void createHerbResultIntent(int result) {
    if ((getActivityTab()) == null)
        return ;
    
    android.content.Intent resultIntent = new android.content.Intent();
    switch (result) {
        case org.chromium.chrome.browser.customtabs.CustomTabActivity.RESULT_STOPPED :
            resultIntent.setAction(Intent.ACTION_VIEW);
            resultIntent.setData(android.net.Uri.parse(getActivityTab().getUrl()));
            break;
        case org.chromium.chrome.browser.customtabs.CustomTabActivity.RESULT_BACK_PRESSED :
        case org.chromium.chrome.browser.customtabs.CustomTabActivity.RESULT_CLOSED :
            break;
        default :
            assert false;
    }
    setResult(result, resultIntent);
}