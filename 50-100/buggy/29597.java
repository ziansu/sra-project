@java.lang.Override
public java.util.List<com.kpi.compsys.model.Project> getChildProjects(java.lang.Integer parrentProjectId) {
    java.util.List<com.kpi.compsys.model.Project> childProjectList = new java.util.LinkedList<com.kpi.compsys.model.Project>();
    for (com.kpi.compsys.model.Project project : projectDao.getAll()) {
        if (project.getParrentProject().getId().equals(parrentProjectId)) {
            childProjectList.add(project);
        }
    }
    return childProjectList;
}