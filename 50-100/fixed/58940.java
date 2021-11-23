public void setTimeoutInfinite() {
    try {
        if (!(isConnected())) {
            connect();
        }
        socket.setSoTimeout(0);
    } catch (java.net.SocketException ex) {
        broken = true;
        throw new redis.clients.jedis.exceptions.JedisConnectionException(ex);
    }
}