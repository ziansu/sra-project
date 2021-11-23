public void enableCache(int size) {
    this.objectCache = new android.support.v4.util.LruCache(size);
}