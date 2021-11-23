@java.lang.Override
protected void onPostExecute(java.util.List<org.chromium.chrome.browser.cookies.CanonicalCookie> cookies) {
    for (org.chromium.chrome.browser.cookies.CanonicalCookie cookie : cookies) {
        org.chromium.chrome.browser.cookies.CookiesFetcher.nativeRestoreCookies(cookie.getUrl(), cookie.getName(), cookie.getValue(), cookie.getDomain(), cookie.getPath(), cookie.getCreationDate(), cookie.getExpirationDate(), cookie.getLastAccessDate(), cookie.isSecure(), cookie.isHttpOnly(), cookie.getSameSite(), cookie.getPriority());
    }
}