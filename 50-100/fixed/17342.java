public final synchronized void notifyRawData(final mark.core.RawData<T> data) {
    java.util.Set<T> set = events.get(data.label);
    if (set == null) {
        set = new java.util.HashSet<>();
        events.put(data.label, set);
    }
    set.add(data.subject);
}