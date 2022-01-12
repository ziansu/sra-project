private void add(java.lang.String key, java.lang.Object value, java.util.Map<java.lang.String, java.util.Set<java.lang.Object>> map) {
    if (key != null) {
        java.util.Set<java.lang.Object> valueSet = map.get(key);
        if (valueSet == null) {
            valueSet = org.mockito.internal.util.collections.Sets.newSet();
        }else
            if (value != null) {
                valueSet.add(value);
            }
        
        map.put(key, valueSet);
    }
}