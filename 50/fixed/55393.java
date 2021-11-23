public boolean removeProject(java.lang.String projectId) {
    return (projects.remove(com.google.common.base.Preconditions.checkNotNull(projectId))) != null ? true : false;
}