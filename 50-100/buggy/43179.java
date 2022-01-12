private static com.emc.storageos.model.ResourceTypeEnum getResourceTypeInternal(final java.lang.Class<?> objectClazz) {
    if (objectClazz == null) {
        return null;
    }else
        if (!(com.emc.storageos.api.service.impl.response.ResourceTypeMapping.resourceMapping.containsKey(objectClazz))) {
            return com.emc.storageos.api.service.impl.response.ResourceTypeMapping.getResourceTypeInternal(objectClazz.getSuperclass());
        }else {
            return com.emc.storageos.api.service.impl.response.ResourceTypeMapping.resourceMapping.get(objectClazz);
        }
    
}