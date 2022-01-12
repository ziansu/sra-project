@java.lang.SuppressWarnings(value = "unchecked")
protected <T extends org.jumpmind.metl.core.model.AbstractObject> T copyWithNewUUID(java.util.Map<java.lang.String, org.jumpmind.metl.core.model.AbstractObject> oldToNewUUIDMapping, T original) {
    T copy = ((T) (original.clone()));
    copy.setId(java.util.UUID.randomUUID().toString());
    oldToNewUUIDMapping.put(original.getId(), copy);
    return copy;
}