public synchronized org.sonarlint.eclipse.core.internal.tracking.IssueTracker get(java.lang.String moduleKey) {
    org.sonarlint.eclipse.core.internal.tracking.IssueTracker tracker = registry.get(moduleKey);
    if (tracker == null) {
        registry.put(moduleKey, newTracker(moduleKey));
    }
    return tracker;
}