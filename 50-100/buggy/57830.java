private static boolean containsError(org.bndtools.builder.DeltaWrapper dw, org.eclipse.core.resources.IMarker[] markers) throws org.eclipse.core.runtime.CoreException {
    if (markers != null)
        for (org.eclipse.core.resources.IMarker marker : markers) {
            int severity = marker.getAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
            if (severity == (org.eclipse.core.resources.IMarker.SEVERITY_ERROR)) {
                if (dw.isTestBin(marker.getResource()))
                    continue;
                
                java.lang.System.out.println(marker.getType());
                java.lang.System.out.println(marker.getAttributes().values());
                return true;
            }
        }
    
    return false;
}