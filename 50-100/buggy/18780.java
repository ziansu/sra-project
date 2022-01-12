public void logOut() {
    android.webkit.CookieSyncManager.createInstance(com.example.tallerdyp2.client.AttractionGOApplication.getAppContext());
    android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
    cookieManager.removeSessionCookie();
    com.twitter.sdk.android.Twitter.getSessionManager().clearActiveSession();
    com.twitter.sdk.android.Twitter.logOut();
    com.example.tallerdyp2.client.AttractionGOApplication.getSplexService().cleanSession();
    android.content.Intent intent = new android.content.Intent(com.example.tallerdyp2.client.AttractionGOApplication.getAppContext(), com.example.tallerdyp2.client.ui.activities.InitialActivity.class);
    com.example.tallerdyp2.client.AttractionGOApplication.getAppContext().startActivity(intent);
}