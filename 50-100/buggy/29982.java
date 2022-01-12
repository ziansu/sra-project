@java.lang.Override
public void selectionChanged(org.eclipse.ui.IWorkbenchPart part, org.eclipse.jface.viewers.ISelection selection) {
    final org.eclipse.ui.IEditorPart editorPart = getSite().getPage().getActiveEditor();
    if (editorPart instanceof org.dbflute.erflute.editor.ERFluteMultiPageEditor) {
        final org.dbflute.erflute.editor.ERFluteMultiPageEditor multiPageEditorPart = ((org.dbflute.erflute.editor.ERFluteMultiPageEditor) (editorPart));
        if (equals(multiPageEditorPart.getActiveEditor())) {
            org.dbflute.erflute.editor.MainDiagramEditor.unselectEditPartByQuickOutline();
            updateActions(getSelectionActions());
        }
    }else {
        super.selectionChanged(part, selection);
    }
}