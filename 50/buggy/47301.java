private void init() {
    conflicts = new java.util.ArrayList<org.eclipse.emf.emfstore.internal.client.model.changeTracking.merging.conflict.VisualConflict>();
    unvisualizedConflicts = new java.util.LinkedHashSet<org.eclipse.emf.emfstore.internal.server.conflictDetection.ConflictBucket>();
    java.util.Set<org.eclipse.emf.emfstore.internal.server.conflictDetection.ConflictBucket> conflictBuckets;
    conflictBuckets = changeConflictSet.getConflictBuckets();
    createConflicts(conflictBuckets);
}