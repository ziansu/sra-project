public void cacheImage(java.lang.String url, int zoom, long i, long j) {
    java.lang.String key = (((((("foo" + url) + ";") + zoom) + "/") + i) + "/") + j;
    synchronized(offered) {
        if (!(offered.contains(key))) {
            offered.add(key);
            deque.offerFirst(key);
        }
    }
}