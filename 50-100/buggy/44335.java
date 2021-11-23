public java.util.Map<java.lang.String, java.lang.Integer> getSynchronizedCounts() {
    final java.util.Map<java.lang.String, java.lang.Integer> counts = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
    final int[] syCounts;
    synchronized(this.syCounts) {
        syCounts = java.util.Arrays.copyOf(this.syCounts, this.syCounts.length);
    }
    for (int i = 0; i < (syCounts.length); i++) {
        counts.put(keys[i], syCounts[i]);
    }
    return counts;
}