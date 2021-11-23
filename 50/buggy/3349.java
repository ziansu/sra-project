private void selectProject(org.talend.core.model.general.Project goodProject) throws org.talend.utils.json.JSONException {
    fillUIBranches(goodProject, true);
    projectViewer.setSelection(new org.eclipse.jface.viewers.StructuredSelection(new java.lang.Object[]{ goodProject }), true);
    setRepositoryContextInContext();
}