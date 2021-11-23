@java.lang.Override
public void addErrorMarker(org.eclipse.core.resources.IResource resource, java.lang.String type, org.eclipse.m2e.core.internal.markers.MavenProblemInfo problem) {
    org.eclipse.core.resources.IMarker marker = addMarker(resource, type, problem.getMessage(), problem.getLocation().getLineNumber(), problem.getSeverity());
    if (marker == null) {
        return ;
    }
    try {
        problem.processMarker(marker);
    } catch (org.eclipse.core.runtime.CoreException ex) {
        org.eclipse.m2e.core.internal.markers.MavenMarkerManager.log.error(ex.getMessage(), ex);
    }
    org.eclipse.m2e.core.internal.markers.MarkerUtils.decorateMarker(marker);
}