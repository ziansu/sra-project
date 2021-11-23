@java.lang.SuppressWarnings(value = "unchecked")
public void put(java.lang.String key, float value) {
    stats.put(key, value);
    if (key.contains("ACTUAL_TIME")) {
        float mins = get("TIME_IN_MINUTES");
        put("TIME_IN_MINUTES", (mins + value));
    }
    if ((key.contains("DEFECTS")) && (!(key.equals("TOTAL_DEFECTS")))) {
        float defs = get("TOTAL_DEFECTS");
        put("TOTAL_DEFECTS", (defs + value));
    }
    saveStats();
}