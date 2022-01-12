private static boolean isPdfIntent(android.content.Intent intent) {
    if ((intent == null) || ((intent.getData()) == null))
        return false;
    
    java.lang.String filename = intent.getData().getLastPathSegment();
    return ((filename != null) && (filename.endsWith(org.chromium.chrome.browser.externalnav.ExternalNavigationDelegateImpl.PDF_SUFFIX))) || (org.chromium.chrome.browser.externalnav.ExternalNavigationDelegateImpl.PDF_MIME.equals(intent.getType()));
}