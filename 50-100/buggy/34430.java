private org.eclipse.core.resources.IMarker createMarker(org.eclipse.emf.ecore.EObject eObject, org.eclipse.core.resources.IFile iFile, java.lang.String sigName) {
    final org.eclipse.core.resources.IMarker marker = eu.modelwriter.marker.internal.MarkerFactory.createInstanceMarker(eObject, iFile, sigName);
    if (marker == null) {
        return null;
    }
    eu.modelwriter.configuration.internal.AlloyUtilities.addTypeToMarker(marker);
    eu.modelwriter.configuration.internal.AlloyUtilities.addMarkerToRepository(marker);
    return marker;
}