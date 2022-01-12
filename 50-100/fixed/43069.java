public java.util.List<domain.task.Task> getUnplannedTasks() {
    java.util.List<domain.task.Task> unplannedTasks = new java.util.ArrayList<>();
    for (domain.task.Task t : getTasks())
        if (!(t.isPlanned()))
            unplannedTasks.add(t);
        
    
    return unplannedTasks;
}