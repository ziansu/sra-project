@java.lang.Override
public java.util.Set<java.lang.String> getAllModuleIds() {
    java.util.Set<java.lang.String> result = new java.util.HashSet<>();
    for (java.lang.String key : getInternalProperties().keySet()) {
        result.add(key.replace(propertyPrefix, ""));
    }
    return result;
}