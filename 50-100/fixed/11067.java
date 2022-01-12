private void setEventLatestState(final java.lang.Long revision) {
    redis.clients.jedis.Jedis jedi = pool.getResource();
    java.lang.String key = getEventLatestStateKey();
    java.util.HashMap<java.lang.String, java.lang.String> state = new java.util.HashMap<>();
    state.put("revision", java.lang.Long.toString(revision));
    jedi.hmset(key, state);
}