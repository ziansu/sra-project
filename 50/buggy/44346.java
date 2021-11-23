@java.lang.Deprecated
public org.eclipse.xtext.diagnostics.Severity getSeverity(org.eclipse.core.resources.IMarker marker) {
    org.eclipse.xtext.diagnostics.Severity translatedSeverity = translateSeverity(marker.getAttribute(IMarker.SEVERITY, 0));
    if (translatedSeverity == null)
        new java.lang.IllegalArgumentException(marker.toString());
    
    return translatedSeverity;
}