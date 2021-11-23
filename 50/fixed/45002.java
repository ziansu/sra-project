static org.eclipse.ui.IEditorPart getActiveEditor() {
    org.eclipse.ui.IWorkbenchWindow window = org.jtool.macrorecorder.internal.recorder.EditorUtilities.getActiveWorkbenchWindow();
    if (window != null) {
        return window.getActivePage().getActiveEditor();
    }
    return null;
}