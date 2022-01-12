protected void turnToCodePage(int newPageIndex) {
    org.talend.core.views.IComponentSettingsView viewer = ((org.talend.core.views.IComponentSettingsView) (org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(IComponentSettingsView.ID)));
    if (viewer != null) {
        viewer.cleanDisplay();
    }
    if ((codeEditor) instanceof org.talend.designer.core.ISyntaxCheckableEditor) {
        moveCursorToSelectedComponent();
    }
    codeSync();
    updateCodeEditorContent();
    changeContextsViewStatus(true);
}