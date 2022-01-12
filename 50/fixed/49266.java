public void forwardAClockCycle(java.util.ArrayList<edu.salisbury.core_simulator.CoreNode.CurrentTask> activeTasks) {
    for (edu.salisbury.core_simulator.CoreNode.CurrentTask task : activeTasks) {
        (task.clockCyclesRemaining)--;
    }
    updateTaskQueue(activeTasks);
}