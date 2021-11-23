public void setTimeoutInfinite() {
    try {
        if (!(isConnected())) {
            connect();
        }
        socket.setKeepAlive(true);
        socket.setSoTimeout(0);
    } catch (java.net.SocketException ex) {
        broken = true;
        throw new redis.clients.jedis.exceptions.JedisConnectionException(ex);
    }
}