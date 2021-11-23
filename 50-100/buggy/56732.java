double getTaskPercentage(int taskIndex) {
    double percentage = 0.0;
    if (taskIndex < (m_Tasks.size())) {
        double totalTaskRuntimeTally = 0.0;
        double specifiedTaskRuntime = ((double) (getTotalTaskRuntimeMs(taskIndex)));
        for (int index = 0; index < (getNumberOfUserTasks()); index++) {
            totalTaskRuntimeTally += getTotalTaskRuntimeMs(index);
        }
        percentage = (specifiedTaskRuntime / totalTaskRuntimeTally) * 100.0;
    }
    return percentage;
}