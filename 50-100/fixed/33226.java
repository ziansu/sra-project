public static java.util.TreeSet<java.lang.String> getActiveRooms(int limit) {
    try {
        int time = ((int) ((java.lang.System.currentTimeMillis()) / 1000));
        java.util.Set<java.lang.String> activeRoomNames = play.modules.redis.Redis.zrange(com.larvalabs.redditchat.util.RedisUtil.REDISKEY_ACTIVE_ROOMS, (-limit), (-1));
        return new java.util.TreeSet<java.lang.String>(activeRoomNames);
    } catch (java.lang.Exception e) {
        play.Logger.error(e, "Error contacting redis.");
        return new java.util.TreeSet<java.lang.String>();
    }
}