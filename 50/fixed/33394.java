private java.lang.Object[] createOrUpdateEntities(java.lang.Object... entities) {
    entities = pm.makePersistentAll(entities);
    return pm.detachCopyAll(entities);
}