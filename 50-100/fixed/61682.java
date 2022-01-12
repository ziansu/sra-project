@java.lang.Override
public final org.workcraft.workspace.WorkspaceEntry execute(org.workcraft.workspace.WorkspaceEntry we) {
    we.saveMemento();
    org.workcraft.dom.visual.VisualModel model = org.workcraft.workspace.WorkspaceUtils.getAs(we, org.workcraft.dom.visual.VisualModel.class);
    layout(model);
    final org.workcraft.Framework framework = org.workcraft.Framework.getInstance();
    final org.workcraft.gui.MainWindow mainWindow = framework.getMainWindow();
    if ((framework.isInGuiMode()) && (mainWindow != null)) {
        final org.workcraft.gui.graph.GraphEditorPanel editor = mainWindow.getCurrentEditor();
        editor.zoomFit();
    }
    return we;
}