@java.lang.Override
public java.util.List<at.ac.tuwien.dst.mms.model.Project> findMatchingByNeighborKey(java.lang.String key, java.lang.String keyValue, int limit) {
    java.util.List<at.ac.tuwien.dst.mms.model.Project> projectWrapper = null;
    if (key.equals("issue")) {
        at.ac.tuwien.dst.mms.model.Project project = repositoryService.getIssueRepository().findByKey(keyValue).getProject();
        projectWrapper = new java.util.ArrayList<>();
        projectWrapper.add(project);
    }
    return projectWrapper;
}