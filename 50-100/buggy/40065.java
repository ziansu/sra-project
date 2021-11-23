public java.lang.Object eval(byte[] script, java.util.List<byte[]> keys, java.util.List<byte[]> args) {
    client.setTimeoutInfinite();
    client.eval(script, redis.clients.jedis.Protocol.toByteArray(keys.size()), getParams(keys, args));
    return client.getOne();
}