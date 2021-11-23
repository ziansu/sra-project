public java.lang.Object eval(byte[] script, java.util.List<byte[]> keys, java.util.List<byte[]> args) {
    return eval(script, redis.clients.jedis.Protocol.toByteArray(keys.size()), getParams(keys, args));
}