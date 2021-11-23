public final boolean newProject(java.lang.String projectName) {
    final de.dfki.vsm.editor.project.ProjectEditor editor = new de.dfki.vsm.editor.project.ProjectEditor();
    editor.getSceneFlowEditor().getSceneFlow().setName(editor.getEditorProject().getEditorConfig().sMAINSUPERNODENAME);
    addProjectTab(projectName, editor);
    if ((mProjectEditors.getTabCount()) == 1) {
        setContentPane(mProjectEditors);
        mEditorMenuBar.setVisible(true);
    }
    refresh();
    return true;
}