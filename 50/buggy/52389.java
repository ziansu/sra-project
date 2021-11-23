public static synchronized aQute.bnd.service.RepositoryPlugin getWorkspaceRepository() throws java.lang.Exception {
    if ((bndtools.central.Central.workspaceRepo) != null)
        return bndtools.central.Central.workspaceRepo;
    
    bndtools.central.Central.workspaceRepo = new aQute.bnd.build.WorkspaceRepository(bndtools.central.Central.getWorkspace());
    return bndtools.central.Central.workspaceRepo;
}