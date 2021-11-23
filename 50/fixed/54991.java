public void enableCache(int size) {
    if (size > 0)
        this.objectCache = new android.support.v4.util.LruCache(size);
    
}