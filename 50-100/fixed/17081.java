@org.chromium.base.annotations.CalledByNative
private org.chromium.chrome.browser.cookies.CanonicalCookie createCookie(java.lang.String name, java.lang.String value, java.lang.String domain, java.lang.String path, long creation, long expiration, long lastAccess, boolean secure, boolean httpOnly, int sameSite, int priority) {
    return new org.chromium.chrome.browser.cookies.CanonicalCookie(name, value, domain, path, creation, expiration, lastAccess, secure, httpOnly, sameSite, priority);
}