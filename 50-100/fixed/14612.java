public synchronized void appendTaskOutput(java.lang.Integer pid, java.lang.String line) {
    if (line == null) {
        return ;
    }
    for (multitask.model.Task task : taskData) {
        if ((task.getProcessId()) == pid) {
            task.appendBuffer(line);
            toc.updateTaskOutput(task, true);
            break;
        }
    }
}