@java.lang.SuppressWarnings(value = "unchecked")
public void put(java.lang.String key, int value) {
    stats.put(key, value);
    saveStats();
}