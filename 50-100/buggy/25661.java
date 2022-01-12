public boolean isTaskComplete(boolean taskComplete, java.util.List<com.rasp.mr.master.Task> tasks) {
    if (!taskComplete) {
        boolean result = true;
        for (com.rasp.mr.master.Task task : tasks) {
            if (!(task.isCompleted())) {
                result = false;
                break;
            }
        }
        if (result && ((tasks.size()) > 0))
            taskComplete = true;
        
    }
    return taskComplete;
}