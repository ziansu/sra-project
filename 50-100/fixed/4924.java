public void resetCurrentRole(java.lang.String role) throws com.silverpeas.processManager.ProcessManagerException {
    if ((role != null) && ((role.length()) > 0)) {
        this.currentRole = role;
    }
    resetCreationRights();
    resetProcessFilter();
    resetCurrentProcessList(false);
    resetCurrentProcessListHeaders();
}