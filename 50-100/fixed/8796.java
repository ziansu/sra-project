public java.util.Collection<net.sf.memoranda.Task> getAllSubTasks(java.lang.String taskId) {
    if ((taskId == null) || ((taskId.length()) == 0)) {
        return getAllRootTasks();
    }else {
        net.sf.memoranda.Task task = getTaskElement(taskId);
        return task.getSubTasks();
    }
}