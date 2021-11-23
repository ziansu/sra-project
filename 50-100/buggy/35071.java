private void doNotify(redis.clients.jedis.Jedis jedis, java.lang.String key) {
    for (java.util.Map.Entry<com.github.ltsopensource.core.cluster.Node, java.util.Set<com.github.ltsopensource.core.registry.NotifyListener>> entry : new java.util.HashMap<com.github.ltsopensource.core.cluster.Node, java.util.Set<com.github.ltsopensource.core.registry.NotifyListener>>(getSubscribed()).entrySet()) {
        doNotify(jedis, java.util.Collections.singletonList(key), new java.util.HashSet<com.github.ltsopensource.core.registry.NotifyListener>(entry.getValue()));
    }
}