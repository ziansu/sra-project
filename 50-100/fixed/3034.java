public java.util.Map<java.lang.String, java.lang.Integer> getPrimaryThreadCounts() {
    final java.util.Map<java.lang.String, java.lang.Integer> counts = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
    final int length = keys.length;
    for (int i = 0; i < length; i++) {
        counts.put(keys[i], ptCounts[i].count);
    }
    return counts;
}