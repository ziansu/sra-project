private void updateEventLatestState(final com.learning.realtime.Operation op) {
    redis.clients.jedis.Jedis jedi = pool.getResource();
    java.lang.String key = getEventLatestStateKey();
    java.util.HashMap<java.lang.String, java.lang.String> state = new java.util.HashMap<>();
    java.lang.Long revision = getLatestRevision();
    revision = (revision != null ? revision : 0) + 1;
    state.put("revision", java.lang.Long.toString(revision));
    jedi.hmset(key, state);
    op.setRevision(revision);
}