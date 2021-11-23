@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    if ((org.nschmidt.ldparteditor.project.Project.getFileToEdit()) != null) {
        org.nschmidt.ldparteditor.composites.Composite3D.showSelectionInTextEditor(org.nschmidt.ldparteditor.project.Project.getFileToEdit());
    }
    regainFocus();
}