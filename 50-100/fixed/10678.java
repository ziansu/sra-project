@java.lang.Override
public jp.hazuki.yuzubrowser.webkit.CustomWebView makeWebView(boolean cacheType) {
    jp.hazuki.yuzubrowser.webkit.CustomWebView web = (cacheType) ? new jp.hazuki.yuzubrowser.webkit.CacheWebView(this) : new jp.hazuki.yuzubrowser.webkit.SwipeWebView(this);
    web.getWebView().setDrawingCacheEnabled(true);
    web.getWebView().buildDrawingCache();
    initWebSetting(web);
    web.setAcceptThirdPartyCookies(android.webkit.CookieManager.getInstance(), (((!(AppData.private_mode.get())) && (AppData.accept_cookie.get())) && (AppData.accept_third_cookie.get())));
    return web;
}