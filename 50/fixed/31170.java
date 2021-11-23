private void setSelectedProject(final org.eclipse.vorto.core.ui.model.IModelProject project) {
    if (project != null) {
        projectSelectionViewer.setSelection(new org.eclipse.jface.viewers.StructuredSelection(project), true);
    }
}