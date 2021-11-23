protected void initCheckedElements() {
    if (this.isIndirect) {
        MappingWizard.beforeCheckedMarkers = eu.modelwriter.configuration.internal.AlloyUtilities.getSecondSideMarkerIdsByMarkerAndRelation(eu.modelwriter.marker.ui.internal.wizards.mappingwizard.MarkerMatchPage.selectedMarker, RelationsWizardPage.selectedRelation.substring(0, RelationsWizardPage.selectedRelation.indexOf(" ")));
    }else {
        MappingWizard.beforeCheckedMarkers = eu.modelwriter.configuration.internal.AlloyUtilities.getSecondSideMarkerIdsByMarkerAndRelationV2(eu.modelwriter.marker.ui.internal.wizards.mappingwizard.MarkerMatchPage.selectedMarker);
    }
    eu.modelwriter.marker.ui.internal.wizards.mappingwizard.MarkerMatchPage.checkedElements = new java.util.ArrayList(MappingWizard.beforeCheckedMarkers);
}