public synchronized org.sonarlint.eclipse.core.internal.tracking.IssueTracker get(java.lang.String moduleKey) {
    org.sonarlint.eclipse.core.internal.tracking.IssueTracker tracker = registry.get(moduleKey);
    if (tracker == null) {
        tracker = newTracker(moduleKey);
        registry.put(moduleKey, tracker);
    }
    return tracker;
}