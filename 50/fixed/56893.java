public void notifyProcessedTask(int numCols) {
    totalColumns.addAndGet(numCols);
    totalProcessedTasks.incrementAndGet();
    LOG.info("Processed: {}/{} tasks, {}/{} subtasks, and {}/{} columns; {} failed tasks", totalProcessedTasks, totalTasksSubmitted, totalProcessedSubTasks, totalSubTasksSubmitted, totalProcessedColumns, totalColumns, totalFailedTasks);
}