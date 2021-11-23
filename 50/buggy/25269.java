@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    org.nschmidt.ldparteditor.dialogs.smooth.SmoothDialog.x = cb_Xaxis[0].getSelection();
    org.nschmidt.ldparteditor.project.Project.getFileToEdit().getVertexManager().selectAll(new org.nschmidt.ldparteditor.helpers.composite3d.SelectorSettings(), true);
}