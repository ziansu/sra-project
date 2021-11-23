private void removeTaskList(java.util.LinkedList<es.caib.seycon.ng.sync.engine.TaskHandler> tasksToRemove) throws es.caib.seycon.ng.exception.InternalErrorException, java.lang.Exception {
    for (es.caib.seycon.ng.sync.engine.TaskHandler taskToRemove : tasksToRemove) {
        if ((taskToRemove.getTimeout()) != null)
            taskToRemove.notify();
        
        taskToRemove.cancel();
        pushTaskToPersist(taskToRemove);
    }
}