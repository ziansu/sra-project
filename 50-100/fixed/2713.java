private static void addToCache(org.cobbzilla.wizard.client.ApiClientBase api, org.cobbzilla.wizard.model.Identifiable entity) {
    synchronized(org.cobbzilla.wizard.model.entityconfig.ModelSetup.entityCache) {
        java.util.Map<org.cobbzilla.wizard.model.Identifiable, org.cobbzilla.wizard.model.Identifiable> cache = org.cobbzilla.wizard.model.entityconfig.ModelSetup.entityCache.get(api.hashCode());
        if (cache == null) {
            cache = new java.util.HashMap<>();
            org.cobbzilla.wizard.model.entityconfig.ModelSetup.entityCache.put(api.hashCode(), cache);
        }
        cache.put(entity, entity);
    }
}