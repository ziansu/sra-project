private java.lang.Object sortMapByKey(java.lang.Object object) {
    if (object instanceof java.util.Map) {
        java.util.Map sortedMap = new java.util.TreeMap(com.google.common.collect.Ordering.natural());
        sortedMap.putAll(((java.util.Map) (object)));
        return sortedMap;
    }else
        if (object instanceof java.util.List) {
            java.util.Collections.sort(((java.util.List) (object)), ( o1, o2) -> o1.toString().compareTo(o2.toString()));
            return object;
        }else {
            return object;
        }
    
}