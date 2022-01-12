public static int updateWhitelist() {
    java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>> cachedWhitelist = net.quetzi.whitelister.Whitelister.whitelist;
    int successCount = 0;
    net.quetzi.whitelister.Whitelister.whitelist = new java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>>();
    for (java.lang.String url : net.quetzi.whitelister.Whitelister.urlList) {
        if (net.quetzi.whitelister.util.WhitelistFetcher.getRemoteWhitelist(url)) {
            successCount++;
        }else {
            Whitelister.log.warn((("Failed to fetch whitelist from " + url) + " using cached list for this source"));
            Whitelister.whitelist.put(url, cachedWhitelist.get(url));
        }
    }
    return successCount;
}