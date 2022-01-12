public final void notifyEvidence(final mark.core.Evidence<T> evidence) {
    java.util.HashSet<T> set = events.get(evidence.label);
    if (set == null) {
        set = new java.util.HashSet<T>();
        events.put(evidence.label, set);
    }
    set.add(evidence.subject);
}