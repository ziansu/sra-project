public boolean removeProject(java.lang.String projectId) {
    if (projects.containsKey(projectId)) {
        projects.remove(com.google.common.base.Preconditions.checkNotNull(projectId));
        return true;
    }
    return false;
}