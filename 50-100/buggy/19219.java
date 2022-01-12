public void run() {
    org.eclipse.ui.IWorkbenchWindow w = org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    if (w == null) {
        org.eclipse.ui.IWorkbenchWindow[] windows = org.eclipse.ui.PlatformUI.getWorkbench().getWorkbenchWindows();
        if ((windows.length) > 0)
            w = windows[0];
        
    }
    if (w != null) {
        result[0] = org.eclipse.ui.PlatformUI.getWorkbench().saveAll(w, w, new org.eclipse.ui.ide.IDE.SaveFilter(resourceRoots), confirm);
    }
}