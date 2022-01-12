private void addType(org.eclipse.core.resources.IMarker selectedMarker) {
    eu.modelwriter.marker.ui.internal.wizards.markerwizard.MarkerWizard markerWizard = new eu.modelwriter.marker.ui.internal.wizards.markerwizard.MarkerWizard(selectedMarker);
    org.eclipse.jface.wizard.WizardDialog dialog = new org.eclipse.jface.wizard.WizardDialog(eu.modelwriter.marker.MarkerActivator.getShell(), markerWizard);
    if ((dialog.open()) == (org.eclipse.jface.window.Window.OK)) {
        for (org.eclipse.core.resources.IMarker iMarker : this.candidateToTypeChanging) {
            eu.modelwriter.marker.ui.internal.wizards.mappingwizard.MappingWizard.convertAnnotationType(iMarker, true, eu.modelwriter.marker.internal.MarkUtilities.compare(iMarker, selectedMarker));
        }
        java.lang.System.out.println("Ok pressed");
    }else {
        java.lang.System.out.println("Cancel pressed");
    }
}