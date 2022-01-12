@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    if ((org.nschmidt.ldparteditor.project.Project.getFileToEdit()) != null) {
        org.nschmidt.ldparteditor.project.Project.getFileToEdit().getVertexManager().addSnapshot();
        org.nschmidt.ldparteditor.project.Project.getFileToEdit().getVertexManager().backupHideShowState();
        org.nschmidt.ldparteditor.project.Project.getFileToEdit().getVertexManager().windingChangeSelection();
    }
    regainFocus();
}