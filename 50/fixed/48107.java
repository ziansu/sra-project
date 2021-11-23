private java.util.concurrent.ConcurrentMap<org.cinchapi.concourse.server.concurrent.RangeToken, V> safeGet(org.cinchapi.concourse.server.model.Text key) {
    java.util.concurrent.ConcurrentMap<org.cinchapi.concourse.server.concurrent.RangeToken, V> filtered = data.get(key);
    return filtered != null ? filtered : safeEmptyMap;
}