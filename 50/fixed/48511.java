public void moveToWorkspace(org.gephi.project.api.Workspace workspace) {
    if (copyToWorkspace(workspace)) {
        delete();
    }
}