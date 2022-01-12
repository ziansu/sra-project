@java.lang.Override
public void earlyStartup() {
    org.eclipse.ui.IWorkbench bench = org.eclipse.ui.PlatformUI.getWorkbench();
    bench.addWindowListener(new org.csstudio.opibuilder.editor.PerspectiveChecker.EditorWindowListener());
    for (org.eclipse.ui.IWorkbenchWindow window : bench.getWorkbenchWindows()) {
        for (org.eclipse.ui.IWorkbenchPage page : window.getPages()) {
            page.addPartListener(new org.csstudio.opibuilder.editor.PerspectiveChecker.EditorPartListener());
        }
    }
}