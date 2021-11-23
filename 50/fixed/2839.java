public java.lang.Object execute(org.eclipse.core.commands.ExecutionEvent event) throws org.eclipse.core.commands.ExecutionException {
    final org.eclipse.ui.IWorkbenchWindow window = org.eclipse.ui.handlers.HandlerUtil.getActiveWorkbenchWindow(event);
    window.getActivePage().closeAllEditors(false);
    edu.rice.cs.hpc.viewer.window.ViewerWindowManager.removeWindow(window);
    window.close();
    return null;
}