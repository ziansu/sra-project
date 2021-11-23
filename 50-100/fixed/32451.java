public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    org.eclipse.swt.widgets.Shell shell = new org.eclipse.swt.widgets.Shell(getDisplay());
    shell.setLocation(200, 100);
    int index = list.getSelectionIndex();
    if (index != (-1)) {
        Event existEvent = events.get(index);
        Workspace workspace = new Workspace(shell, org.eclipse.swt.SWT.None, existEvent);
        workspace.pack();
        shell.pack();
        shell.open();
        getParent().dispose();
    }
}