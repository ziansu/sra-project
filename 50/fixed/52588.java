@java.lang.SuppressWarnings(value = "unchecked")
public void put(java.lang.String key, float value) {
    stats.put(key, value);
    saveStats();
}