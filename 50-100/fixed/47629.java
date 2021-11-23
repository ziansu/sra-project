@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
@java.lang.Override
public java.lang.Object getAdapter(java.lang.Object adaptableObject, java.lang.Class adapterType) {
    if (adaptableObject instanceof org.eclipse.ui.texteditor.ITextEditor) {
        org.eclipse.ui.texteditor.ITextEditor editor = ((org.eclipse.ui.texteditor.ITextEditor) (adaptableObject));
        org.eclipse.core.resources.IResource resource = editor.getEditorInput().getAdapter(org.eclipse.core.resources.IResource.class);
        if (resource != null) {
            java.lang.String extension = resource.getFileExtension();
            if ((extension != null) && (extension.equalsIgnoreCase(Activator.MLM_EXTENSION))) {
                return new arden2bytecodeeclipseplugin.breakpoints.BreakpointAdapter();
            }
        }
    }
    return null;
}