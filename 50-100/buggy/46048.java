public void add(java.net.URI uri, java.net.HttpCookie cookie) {
    if (cookie == null) {
        throw new java.lang.NullPointerException("cookie is null");
    }
    lock.lock();
    try {
        if ((cookie.getMaxAge()) != 0) {
            addIndex(uriIndex, getEffectiveURI(uri), cookie);
        }
    } finally {
        lock.unlock();
    }
}