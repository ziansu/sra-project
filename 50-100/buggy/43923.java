public static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.atomic.AtomicInteger> getGroupTimeStampCopy(java.lang.String groupName) {
    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.atomic.AtomicInteger> ret = new java.util.concurrent.ConcurrentHashMap<>();
    for (java.util.Map.Entry<java.lang.String, java.util.concurrent.atomic.AtomicInteger> entry : multicast.MulticastCoordinator.instance.getGroupTimeStampMap().get(groupName).entrySet()) {
        ret.put(entry.getKey(), entry.getValue());
    }
    return ret;
}