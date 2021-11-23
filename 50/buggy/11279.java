public com.netcetera.codecamp.graphqldemo.type.Project addTaskToProject(com.netcetera.codecamp.graphqldemo.type.Task task, java.lang.Long projectId) {
    taskService.save(task);
    com.netcetera.codecamp.graphqldemo.type.Project project = projectService.getById(projectId);
    project.getTasks().add(task);
    return projectService.save(project);
}