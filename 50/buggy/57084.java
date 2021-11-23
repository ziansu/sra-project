@java.lang.Override
public net.nedkargov.business.domain.ProjectDetailsInterface createProject(net.nedkargov.business.domain.ProjectDetailsInterface project) {
    java.lang.Integer id = projectMapper.insertProject(project);
    return projectMapper.getProjectDetails(id);
}