private void createRestoreTableArea(org.eclipse.swt.widgets.Composite parent) {
    try {
        selectedConfig = getBackupServerConfig();
        currentPath = getInitialPath(selectedConfig.getDestPath());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    parent.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.FILL, org.eclipse.swt.SWT.FILL, true, true));
    parent.setLayout(new org.eclipse.swt.layout.GridLayout(1, false));
    createTableButtonArea(parent);
    createTableFilterArea(parent);
    createTableArea(parent);
}