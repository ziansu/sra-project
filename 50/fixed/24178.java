public fi.muikku.plugins.workspace.model.WorkspaceFolder createWorkspaceFolder(fi.muikku.plugins.workspace.model.WorkspaceNode parent, java.lang.String title) {
    java.lang.String urlName = generateUniqueUrlName(parent, title);
    return createWorkspaceFolder(parent, title, urlName);
}