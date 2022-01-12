private android.webkit.WebResourceResponse loadFromWeb(de.lilithwittmann.voicepitchanalyzer.utils.CacheableWebViewClient.UrlCache.CacheEntry entry) {
    try {
        downloadAndStore(entry);
        return loadFromCache(entry);
    } catch (java.lang.Exception e) {
        android.util.Log.d(de.lilithwittmann.voicepitchanalyzer.utils.CacheableWebViewClient.LOG_TAG, ("Error reading file over network: " + (entry.url)), e);
    }
    return null;
}