private boolean supportsBreakpoint(org.eclipse.debug.core.model.IBreakpoint bp) {
    if ((bp instanceof org.eclipse.cdt.debug.core.model.ICBreakpoint) && (bp.getModelIdentifier().equals(fDebugModelId))) {
        org.eclipse.core.resources.IMarker marker = bp.getMarker();
        if (marker != null) {
            return true;
        }
    }
    return false;
}