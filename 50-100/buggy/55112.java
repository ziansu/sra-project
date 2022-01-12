@org.wisdom.jongo.bridge.Invalidate
public void stop() {
    org.wisdom.jongo.bridge.JongoRepository.LOGGER.info("Stopping Jongo Repository for {}", database.getName());
    java.util.Map<org.osgi.framework.Bundle, java.util.List<org.wisdom.jongo.bridge.JongoRepository.InstantiatedCrud>> map = new java.util.HashMap(tracker.getTracked());
    tracker.close();
    for (java.util.Map.Entry<org.osgi.framework.Bundle, java.util.List<org.wisdom.jongo.bridge.JongoRepository.InstantiatedCrud>> entry : map.entrySet()) {
        for (org.wisdom.jongo.bridge.JongoRepository.InstantiatedCrud c : entry.getValue()) {
            c.unregister();
        }
    }
}