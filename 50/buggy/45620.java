public static java.lang.String formatUrlForSecurityDisplay(java.net.URI uri, boolean showScheme) {
    if (showScheme) {
        return org.chromium.chrome.browser.UrlUtilities.nativeFormatUrlForSecurityDisplay(uri.toString());
    }else {
        return org.chromium.chrome.browser.UrlUtilities.nativeFormatUrlForSecurityDisplayOmitScheme(uri.toString());
    }
}