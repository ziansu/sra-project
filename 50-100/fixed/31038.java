protected boolean removeEldestEntry(java.util.Map.Entry<java.lang.String, com.clearspring.analytics.stream.frequency.CountMinSketch> eldest) {
    try {
        if ((size()) > (cacheSize)) {
            java.lang.String key = eldest.getKey();
            com.clearspring.analytics.stream.frequency.CountMinSketch value = eldest.getValue();
            writeSketch(key, value);
            return true;
        }else {
            return false;
        }
    } catch (java.io.IOException ex) {
        throw new java.io.UncheckedIOException(ex);
    }
}