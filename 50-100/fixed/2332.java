public void resourceChanged(org.eclipse.core.resources.IResourceChangeEvent event) {
    java.util.Collection<org.eclipse.core.resources.IMarkerDelta> markerWithErrors = com.google.common.collect.Collections2.filter(java.util.Arrays.asList(event.findMarkerDeltas(null, true)), Predicates.isVortoModelWithMarkerError);
    if (!(markerWithErrors.isEmpty())) {
        executeRunnableOnDisplayThread();
    }
}