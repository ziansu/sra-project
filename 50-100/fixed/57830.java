private static boolean containsError(org.bndtools.builder.DeltaWrapper dw, org.eclipse.core.resources.IMarker[] markers) {
    if (markers != null)
        for (org.eclipse.core.resources.IMarker marker : markers) {
            int severity = marker.getAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
            if (severity == (org.eclipse.core.resources.IMarker.SEVERITY_ERROR)) {
                if (dw.isTestBin(marker.getResource()))
                    continue;
                
                return true;
            }
        }
    
    return false;
}