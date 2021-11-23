private void findCandidateToTypeChangingMarkers(final org.eclipse.core.resources.IMarker iMarker) {
    this.candidateToTypeChanging.add(iMarker);
    final java.util.ArrayList<org.eclipse.core.resources.IMarker> relationsSources = eu.modelwriter.configuration.internal.AlloyUtilities.getSourcesOfMarkerAtRelations(iMarker);
    for (final org.eclipse.core.resources.IMarker marker : relationsSources) {
        this.candidateToTypeChanging.add(marker);
    }
}