private static java.util.Map<java.lang.String, java.lang.Long> joinMap(java.util.Map<java.lang.String, java.lang.Long> parent, java.util.Map<java.lang.String, java.lang.Long> child) {
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : child.entrySet()) {
        java.lang.String key = entry.getKey();
        java.lang.Long count = entry.getValue();
        if (parent.containsKey(key)) {
            count = count + (parent.get(key));
        }
        parent.put(key, count);
    }
    return parent;
}