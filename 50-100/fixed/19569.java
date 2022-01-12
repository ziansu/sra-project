public java.lang.String notifyOnline(java.lang.String userId, java.lang.String clientId) {
    java.util.Date now = cn.edu.sjtu.se.dclab.oss.util.TimeUtil.now();
    org.redisson.core.RMap<java.lang.String, java.util.Date> map = redisson.getMap(userId);
    removeExpiredClients(map, now);
    map.put(clientId, cn.edu.sjtu.se.dclab.oss.util.TimeUtil.now());
    map.clearExpire();
    map.expire(Constants.REDIS_KEY_EXPIRE_TIME, java.util.concurrent.TimeUnit.SECONDS);
    return cn.edu.sjtu.se.dclab.oss.util.Constants.SUCCESS;
}