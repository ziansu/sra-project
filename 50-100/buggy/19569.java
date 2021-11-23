public java.lang.String notifyOnline(java.lang.String userId, java.lang.String clientId) {
    java.util.Date now = cn.edu.sjtu.se.dclab.oss.util.TimeUtil.now();
    cn.edu.sjtu.se.dclab.oss.redis.ClientLastSeenTime client = new cn.edu.sjtu.se.dclab.oss.redis.ClientLastSeenTime(clientId, now);
    org.redisson.core.RMap<java.lang.String, cn.edu.sjtu.se.dclab.oss.redis.ClientLastSeenTime> map = redisson.getMap(userId);
    removeExpiredClients(map, now);
    map.put(userId, client);
    map.clearExpire();
    map.expire(Constants.REDIS_KEY_EXPIRE_TIME, java.util.concurrent.TimeUnit.SECONDS);
    return cn.edu.sjtu.se.dclab.oss.util.Constants.SUCCESS;
}