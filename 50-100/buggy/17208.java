public void open(java.lang.String projectName) {
    this.projectName = projectName;
    org.eclipse.swt.widgets.Display display = org.eclipse.swt.widgets.Display.getDefault();
    createContents();
    shell.open();
    shell.layout();
    util.PtkUtil.centerShell(shell);
    while ((!(shell.isDisposed())) && (org.eclipse.ui.PlatformUI.isWorkbenchRunning())) {
        if (!(display.readAndDispatch())) {
            display.sleep();
        }
    } 
}