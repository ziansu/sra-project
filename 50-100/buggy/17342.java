public final void notifyRawData(final mark.core.RawData<T> data) {
    java.util.HashSet<T> set = events.get(data.label);
    if (set == null) {
        set = new java.util.HashSet<T>();
        events.put(data.label, set);
    }
    set.add(data.subject);
}