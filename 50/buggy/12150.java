@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    org.nschmidt.ldparteditor.helpers.compositetext.ProjectActions.createNewProject(org.nschmidt.ldparteditor.shells.editor3d.Editor3DWindow.getWindow(), false);
    addRecentFile(org.nschmidt.ldparteditor.project.Project.getProjectPath());
    regainFocus();
}