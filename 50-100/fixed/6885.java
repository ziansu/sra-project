@java.lang.Override
public java.lang.Object execute(org.eclipse.core.commands.ExecutionEvent event) throws org.eclipse.core.commands.ExecutionException {
    if (eu.modelwriter.configuration.internal.AlloyUtilities.isExists()) {
        this.candidateToTypeChanging = new java.util.ArrayList<org.eclipse.core.resources.IMarker>();
        addRemoveType();
    }else {
        org.eclipse.jface.dialogs.MessageDialog infoDialog = new org.eclipse.jface.dialogs.MessageDialog(eu.modelwriter.marker.MarkerActivator.getShell(), "System Information", null, "You dont have any registered alloy file to system.", org.eclipse.jface.dialogs.MessageDialog.INFORMATION, new java.lang.String[]{ "OK" }, 0);
        infoDialog.open();
    }
    return null;
}