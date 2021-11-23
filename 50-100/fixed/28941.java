public void addMessage(java.lang.String key, cz.muni.fi.pv243.spatialtracker.webchat.model.WebChatMessage message) {
    org.infinispan.Cache<java.lang.String, java.util.List<cz.muni.fi.pv243.spatialtracker.webchat.model.WebChatMessage>> messagesCache = cacheProvider.getMessageCache();
    java.util.List<cz.muni.fi.pv243.spatialtracker.webchat.model.WebChatMessage> messages = messagesCache.get(key);
    if (messages == null) {
        messages = new java.util.LinkedList<>();
    }
    messages.add(message);
    messagesCache.put(key, messages);
}