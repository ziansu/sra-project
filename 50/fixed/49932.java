public void allocateTask(chessmaster.AllocatedTask task) {
    if ((waste) == null)
        waste = value;
    
    allocatedTasks.add(task);
    waste -= task.cost;
}