public boolean select(org.eclipse.ui.Saveable saveable, org.eclipse.ui.IWorkbenchPart[] containingParts) {
    if (isDescendantOfRoots(saveable)) {
        return true;
    }
    for (int i = 0; i < (containingParts.length); i++) {
        org.eclipse.ui.IWorkbenchPart workbenchPart = containingParts[i];
        if (workbenchPart instanceof org.eclipse.ui.IEditorPart) {
            org.eclipse.ui.IEditorPart editorPart = ((org.eclipse.ui.IEditorPart) (workbenchPart));
            if (isEditingDescendantOf(editorPart)) {
                return true;
            }
        }
    }
    return false;
}