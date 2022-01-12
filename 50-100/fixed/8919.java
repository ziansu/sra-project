public void removeTask(net.sf.memoranda.Task task) {
    if (task == null) {
        return ;
    }
    java.lang.String parentTaskId = task.getParentID();
    if (parentTaskId != null) {
        net.sf.memoranda.Task parentNode = getTaskElement(parentTaskId);
        if (parentNode != null)
            parentNode.removeSubTask(task);
        
    }
    taskList.remove(task.getID());
    rootTaskList.remove(task);
}