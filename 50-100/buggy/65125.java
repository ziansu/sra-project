private void removeExpiredClients(org.redisson.core.RMap<java.lang.String, cn.edu.sjtu.se.dclab.oss.redis.ClientLastSeenTime> map, java.util.Date date) {
    for (java.util.Map.Entry<java.lang.String, cn.edu.sjtu.se.dclab.oss.redis.ClientLastSeenTime> entry : map.entrySet()) {
        boolean expired = checkExpires(entry.getValue(), date);
        if (expired) {
            map.remove(entry.getKey());
        }
    }
}