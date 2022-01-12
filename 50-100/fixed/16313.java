public java.util.List<graphene.model.idl.G_Workspace> getListOfWorkspaces() {
    if (userExists) {
        try {
            logger.debug("Updating list of workspaces");
            workspaces = userDataAccess.getWorkspacesForUser(user.getId());
        } catch (final org.apache.avro.AvroRemoteException e) {
            logger.error(e.getMessage());
        }
    }else {
        logger.error("No user name to get workspaces for.");
        workspaces = null;
    }
    return workspaces;
}