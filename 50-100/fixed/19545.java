public java.util.Set<? extends K> getCacheLineKeys() {
    java.util.Set<java.lang.Object> keys;
    if (memoryTable.containsKey(ObjectType.NULL)) {
        keys = new java.util.HashSet(memoryTable.keySet());
        keys.remove(ObjectType.NULL);
        keys.add(null);
    }else {
        keys = memoryTable.keySet();
    }
    return java.util.Collections.unmodifiableSet(org.apache.ofbiz.base.util.UtilGenerics.<java.util.Set<? extends K>>cast(keys));
}