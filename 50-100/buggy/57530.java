protected void reply(com.moilioncircle.redis.cluster.watchdog.util.net.transport.Transport<byte[][]> t, byte[] message) {
    t.write("+", false);
    t.write(message, false);
    t.write("\r\n".getBytes(), true);
}