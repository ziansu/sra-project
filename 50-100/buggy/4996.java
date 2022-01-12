@java.lang.Override
public void updateUserId(java.lang.String id, java.lang.String oldUserId, java.lang.String newUserId) {
    if (!(com.jeedsoft.jocket.util.JocketStringUtil.isEmpty(oldUserId))) {
        java.lang.String key = getUserKey(oldUserId);
        com.jeedsoft.jocket.storage.redis.JocketRedisExecutor.srem(key, id);
    }
    if (!(com.jeedsoft.jocket.util.JocketStringUtil.isEmpty(newUserId))) {
        java.lang.String key = getUserKey(oldUserId);
        com.jeedsoft.jocket.storage.redis.JocketRedisExecutor.sadd(key, id);
    }
}