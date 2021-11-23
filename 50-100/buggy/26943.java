private void removeSubFromTopicCache(org.eclipse.moquette.spi.impl.subscriptions.Subscription s) {
    java.util.Set<org.eclipse.moquette.spi.impl.subscriptions.Subscription> subscriptions = topicSubCache.get(s.getTopicFilter());
    boolean removed = subscriptions.remove(s);
    if (removed) {
        topicSubCache.put(s.getTopicFilter(), subscriptions);
    }
}