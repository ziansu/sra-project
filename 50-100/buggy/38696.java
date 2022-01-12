private void unsubscribeOwnership(int entityId) {
    synchronized(ownersToTopics) {
        final java.util.Set<java.lang.String> topics = ownersToTopics.remove(entityId);
        if (topics != null) {
            for (java.lang.String topic : topics) {
                topicsToOwners.get(topic).remove(entityId);
            }
        }
    }
}