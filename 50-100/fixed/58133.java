public final synchronized void notifyEvidence(final mark.core.Evidence<T> evidence) {
    java.util.Set<T> set = events.get(evidence.label);
    if (set == null) {
        set = new java.util.HashSet<>();
        events.put(evidence.label, set);
    }
    set.add(evidence.subject);
}