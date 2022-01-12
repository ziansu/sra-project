public static boolean isInternalMeta(java.lang.String metaPropertyName) {
    for (alien4cloud.model.common.InternalMetaProperties meta : alien4cloud.model.common.InternalMetaProperties.values()) {
        if (metaPropertyName.toLowerCase().startsWith(meta.name()))
            return true;
        
    }
    return false;
}