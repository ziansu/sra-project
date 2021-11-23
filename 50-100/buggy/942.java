@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    notifyListeners(SWT.Selection, new org.eclipse.swt.widgets.Event());
    org.eclipse.ice.iclient.IClient client = org.eclipse.ice.client.common.internal.ClientHolder.getClient();
    org.eclipse.swt.widgets.FileDialog fileDialog = new org.eclipse.swt.widgets.FileDialog(getShell());
    fileDialog.setText("Select a file to import into ICE");
    java.lang.String filePath = fileDialog.open();
    if (filePath != null) {
        java.io.File importedFile = new java.io.File(filePath);
        client.importFile(importedFile.toURI());
        setEntryValue(importedFile.getName());
    }
    return ;
}