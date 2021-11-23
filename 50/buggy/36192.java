@java.lang.Override
public java.lang.String getCursorForHost(java.lang.String host) {
    redis.clients.jedis.ScanResult<T> sr = result.get(host);
    if (sr != null) {
        return sr.getStringCursor();
    }
    return null;
}