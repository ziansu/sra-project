public void deposit(java.util.Collection<java.lang.String> urls) {
    for (java.lang.String url : urls) {
        synchronized(urlQueue) {
            if (!(hasVisited(url))) {
                urlSet.add(url);
                bloomFilter.addUrl(url);
            }
            (newUrlNum)++;
            if ((newUrlNum) >= 1000) {
                com.zhiwen.crawler.common.strategy.BloomUtil.writeToFile(bloomFilter, com.zhiwen.crawler.url.store.spi.impl.UrlMarketImpl.BLOOM_OBJECT_PATH);
                writeUrlsToFile(com.zhiwen.crawler.url.store.spi.impl.UrlMarketImpl.URLS_STORE_PATH, urlSet);
                urlSet.clear();
                newUrlNum = 0;
            }
        }
    }
}