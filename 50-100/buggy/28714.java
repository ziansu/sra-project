static org.eclipse.ui.IEditorPart getEditor(org.eclipse.core.resources.IFile file) {
    org.eclipse.ui.IEditorInput input = new org.eclipse.ui.part.FileEditorInput(file);
    org.eclipse.ui.IWorkbenchWindow[] windows = org.eclipse.ui.PlatformUI.getWorkbench().getWorkbenchWindows();
    for (org.eclipse.ui.IWorkbenchWindow window : windows) {
        org.eclipse.ui.IWorkbenchPage[] pages = window.getPages();
        for (org.eclipse.ui.IWorkbenchPage page : pages) {
            org.eclipse.ui.IEditorPart part = page.findEditor(input);
            return part;
        }
    }
    return null;
}