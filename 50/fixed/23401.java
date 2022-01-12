@java.lang.Override
public java.util.List<main.java.com.seckill.entity.DetailProject> queryDetailProjectById(long projectId) {
    main.java.com.seckill.entity.Project project = projectDao.queryDetailProjectById(projectId);
    if (project == null)
        return null;
    
    return project.getDetailProjects();
}