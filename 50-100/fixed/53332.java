@java.lang.Override
public void open(int offset) throws com.danikula.videocache.ProxyCacheException {
    try {
        connection = openConnection(offset);
        mime = connection.getContentType();
        inputStream = new java.io.BufferedInputStream(connection.getInputStream(), com.danikula.videocache.ProxyCacheUtils.DEFAULT_BUFFER_SIZE);
        length = readSourceAvailableBytes(connection, offset, connection.getResponseCode());
    } catch (java.io.IOException e) {
        throw new com.danikula.videocache.ProxyCacheException(((("Error opening connection for " + (url)) + " with offset ") + offset), e);
    }
}