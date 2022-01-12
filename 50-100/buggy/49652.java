@java.lang.SuppressWarnings(value = "unchecked")
protected <T extends org.jumpmind.metl.core.model.AbstractObject> T copyWithNewUUID(java.util.Map<java.lang.String, java.lang.String> oldToNewUUIDMapping, T original) {
    T copy = ((T) (original.clone()));
    copy.setId(java.util.UUID.randomUUID().toString());
    oldToNewUUIDMapping.put(original.getId(), copy.getId());
    return copy;
}