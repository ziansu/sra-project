@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    if ((org.nschmidt.ldparteditor.project.Project.getFileToEdit()) != null) {
        org.nschmidt.ldparteditor.project.Project.getFileToEdit().getVertexManager().addSnapshot();
        org.nschmidt.ldparteditor.project.Project.getFileToEdit().getVertexManager().colourChangeSelection(16, 0.5F, 0.5F, 0.5F, 1.0F, true);
    }
    org.nschmidt.ldparteditor.shells.editor3d.Editor3DWindow.getWindow().regainFocus();
}