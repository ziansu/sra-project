@java.lang.SuppressWarnings(value = "unchecked")
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    org.eclipse.jface.viewers.ITreeSelection selection = projectTreeViewer.getStructuredSelection();
    java.util.Iterator<org.eclipse.m2e.core.project.MavenProjectInfo> iterator = selection.iterator();
    while (iterator.hasNext()) {
        org.eclipse.m2e.core.project.MavenProjectInfo projectInfo = iterator.next();
        addProjectToImportList(projectInfo);
    } 
    projectTreeViewer.setSelection(null);
    projectTreeViewer.refresh();
    projectImportListViewer.refresh();
}