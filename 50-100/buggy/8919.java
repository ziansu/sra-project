public void removeTask(net.sf.memoranda.Task task) {
    java.lang.String parentTaskId = task.getParentID();
    if (parentTaskId != null) {
        net.sf.memoranda.Task parentNode = getTaskElement(parentTaskId);
        parentNode.removeSubTask(task);
    }
    taskList.remove(task.getID());
    rootTaskList.remove(task);
}