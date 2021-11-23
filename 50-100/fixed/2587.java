private java.util.ArrayList<org.eclipse.core.resources.IMarker> findCandidateToTypeChangingMarkers(final org.eclipse.core.resources.IMarker iMarker) {
    final java.util.ArrayList<org.eclipse.core.resources.IMarker> candidateToTypeChanging = new java.util.ArrayList<>();
    candidateToTypeChanging.add(iMarker);
    final java.util.ArrayList<org.eclipse.core.resources.IMarker> relationsSources = eu.modelwriter.configuration.internal.AlloyUtilities.getSourcesOfMarkerAtRelations(iMarker);
    for (final org.eclipse.core.resources.IMarker marker : relationsSources) {
        candidateToTypeChanging.add(marker);
    }
    return candidateToTypeChanging;
}