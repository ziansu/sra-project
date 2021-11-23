public java.lang.String put(java.lang.String longUrl) {
    java.lang.String shortUrl = getShortUrl(longUrl);
    if ((this.capSize) > 0) {
        this.cacheMap.put(shortUrl, longUrl);
    }else {
        java.lang.String currLast = "";
        for (java.lang.String key : this.cacheMap.keySet()) {
            currLast = key;
        }
        this.cacheMap.remove(currLast);
        this.cacheMap.put(shortUrl, longUrl);
    }
    return shortUrl;
}