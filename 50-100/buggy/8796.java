public java.util.Collection getAllSubTasks(java.lang.String taskId) {
    if ((taskId == null) || ((taskId.length()) == 0)) {
        return getAllRootTasks();
    }else {
        net.sf.memoranda.Task task = getTaskElement(taskId);
        if (task == null) {
            return new java.util.Vector();
        }
        return task.getSubTasks();
    }
}