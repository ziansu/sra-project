@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    java.io.File file = new java.io.File(com.project.traceability.GUI.HomeGUI.projectPath);
    if (!(file.isDirectory())) {
        org.eclipse.swt.widgets.TreeItem parent = com.project.traceability.GUI.HomeGUI.trtmNewTreeitem.getParentItem();
        com.project.traceability.GUI.HomeGUI.trtmNewTreeitem = com.project.traceability.GUI.HomeGUI.trtmNewTreeitem.getParentItem();
        com.project.traceability.GUI.HomeGUI.projectPath = (com.project.traceability.common.PropertyFile.filePath) + (parent.getText());
    }
    com.project.traceability.GUI.NewFileWindow newFileWin = new com.project.traceability.GUI.NewFileWindow();
    newFileWin.open();
}