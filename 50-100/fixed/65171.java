@java.lang.Override
public org.bird.breeze.session.impl.ShareSession getRemoteSession(java.lang.String sessionId) {
    redis.clients.jedis.Jedis jedis = org.bird.breeze.util.RedisUtils.getJedis();
    byte[] keys = org.bird.breeze.util.SerializeUtils.objectToByte(sessionId);
    byte[] values = jedis.get(keys);
    org.bird.breeze.session.impl.ShareSession session = ((org.bird.breeze.session.impl.ShareSession) (org.bird.breeze.util.SerializeUtils.byteToObject(values)));
    org.bird.breeze.util.RedisUtils.returnResource(jedis);
    return session;
}