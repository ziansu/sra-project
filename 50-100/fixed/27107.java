private boolean isSharedProject(com.surevine.community.gateway.model.Destination destination, java.util.Map<java.lang.String, java.lang.String> metadata) {
    java.lang.String projectSlug = java.lang.String.format("%s/%s", metadata.get("project"), metadata.get("repo"));
    java.util.Set<java.lang.String> destinationSharedProjects = null;
    if (destinationSharedProjects != null) {
        for (java.lang.String sharedProject : destinationSharedProjects) {
            if (sharedProject.equalsIgnoreCase(projectSlug)) {
                return true;
            }
        }
    }
    return false;
}