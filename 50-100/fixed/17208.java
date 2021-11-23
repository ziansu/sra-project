public void open() {
    org.eclipse.swt.widgets.Display display = org.eclipse.swt.widgets.Display.getDefault();
    shell.open();
    shell.layout();
    util.PtkUtil.centerShell(shell);
    while ((!(shell.isDisposed())) && (org.eclipse.ui.PlatformUI.isWorkbenchRunning())) {
        if (!(display.readAndDispatch())) {
            display.sleep();
        }
    } 
}