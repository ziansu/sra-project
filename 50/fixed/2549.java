private java.net.HttpURLConnection openConnection(int offset) throws com.danikula.videocache.ProxyCacheException, java.io.IOException {
    return openConnection(offset, false);
}