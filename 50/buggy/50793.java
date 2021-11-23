@java.lang.Override
public void windowOpened(org.eclipse.ui.IWorkbenchWindow window) {
    for (org.eclipse.ui.IWorkbenchPage page : window.getPages()) {
        page.addPartListener(new org.csstudio.opibuilder.editor.PerspectiveChecker.EditorPartListener());
    }
    window.addPageListener(new org.csstudio.opibuilder.editor.PerspectiveChecker.EditorPageListener());
}