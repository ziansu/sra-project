public void moveToWorkspace(org.gephi.project.api.Workspace workspace) {
    copyToWorkspace(workspace);
    delete();
}