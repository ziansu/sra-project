@java.lang.Override
public boolean select(org.eclipse.ui.Saveable saveable, org.eclipse.ui.IWorkbenchPart[] containingParts) {
    if (isDescendantOfRoots(saveable)) {
        return true;
    }
    for (org.eclipse.ui.IWorkbenchPart workbenchPart : containingParts) {
        if (workbenchPart instanceof org.eclipse.ui.IEditorPart) {
            org.eclipse.ui.IEditorPart editorPart = ((org.eclipse.ui.IEditorPart) (workbenchPart));
            if (isEditingDescendantOf(editorPart)) {
                return true;
            }
        }
    }
    return false;
}