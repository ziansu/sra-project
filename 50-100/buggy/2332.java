public void resourceChanged(org.eclipse.core.resources.IResourceChangeEvent event) {
    java.util.Collection<org.eclipse.core.resources.IMarkerDelta> markerWithErrors = com.google.common.collect.Collections2.filter(com.google.common.collect.Lists.newArrayList(event.findMarkerDeltas(null, true)), Predicates.isVortoModelWithMarkerError);
    if (!(markerWithErrors.isEmpty())) {
        executeRunnableOnDisplayThread();
    }
}