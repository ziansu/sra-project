public V get(java.lang.String name, java.util.Locale locale) {
    for (java.util.Map<K, V> curMap : this.stackList) {
        if (curMap.containsKey(name)) {
            if (curMap instanceof org.apache.ofbiz.base.util.collections.LocalizedMap<?>) {
                org.apache.ofbiz.base.util.collections.LocalizedMap<V> lmap = org.apache.ofbiz.base.util.UtilGenerics.cast(curMap);
                return lmap.get(name, locale);
            }
            return curMap.get(name);
        }
    }
    return null;
}