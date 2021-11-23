private static com.github.pfichtner.ardulink.core.Link increaseUsageCounter(com.github.pfichtner.ardulink.core.Link link) {
    java.util.concurrent.atomic.AtomicInteger counter = org.zu.ardulink.connection.proxy.NetworkProxyServer.usageCounter.get(link);
    if (counter == null) {
        java.util.concurrent.atomic.AtomicInteger tmp = org.zu.ardulink.connection.proxy.NetworkProxyServer.usageCounter.putIfAbsent(link, new java.util.concurrent.atomic.AtomicInteger());
        if (tmp != null) {
            counter = tmp;
        }
    }
    counter.incrementAndGet();
    return link;
}