private void initializeParameters(com.bow3n.controller.server.model.Task task) {
    task.setFinished(java.lang.Boolean.FALSE);
    if (((task.getProject()) != null) && ((task.getProject().getId()) != null)) {
        task.setProject(projectRepository.findOne(task.getProject().getId()));
    }
}