public void disconnect() {
    if (isConnected()) {
        try {
            outputStream.flush();
            socket.close();
        } catch (java.io.IOException ex) {
            broken = true;
            throw new redis.clients.jedis.exceptions.JedisConnectionException(ex);
        } finally {
            redis.clients.util.IOUtils.closeQuietly(socket);
        }
    }
}