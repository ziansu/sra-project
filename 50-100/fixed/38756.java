@java.lang.Override
public final void checkConnection() {
    com.thoughtworks.go.domain.materials.tfs.AbstractTfsCommand.LOGGER.info(java.lang.String.format("[TFS] Checking Connection: Server %s, Domain %s, User %s, Project Path %s", url, domain, userName, projectPath));
    try {
        java.util.List<com.thoughtworks.go.domain.materials.Modification> modifications = latestInHistory();
        if (modifications.isEmpty()) {
            throw new java.lang.IllegalStateException("There might be no commits on the project path, project path might be invalid or user may have insufficient permissions.");
        }
    } catch (java.lang.Exception e) {
        java.lang.String message = java.lang.String.format("Failed while checking connection using Url: %s, Project Path: %s, Username: %s, Domain: %s, Root Cause: %s", url, projectPath, userName, domain, e.getMessage());
        throw new java.lang.RuntimeException(message, e);
    }
}