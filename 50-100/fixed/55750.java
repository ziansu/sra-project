public org.chromium.content_public.browser.WebContents addPrerender(org.chromium.chrome.browser.profiles.Profile profile, java.lang.String url, java.lang.String referrer, int width, int height) {
    org.chromium.content_public.browser.WebContents webContents = org.chromium.chrome.browser.WebContentsFactory.createWebContents(false, false);
    if (addPrerender(profile, webContents, url, referrer, width, height)) {
        return webContents;
    }
    if (webContents != null)
        webContents.destroy();
    
    return null;
}