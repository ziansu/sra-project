@java.lang.Override
public void run() {
    org.structr.core.agent.AgentService.logger.log(java.util.logging.Level.INFO, "AgentService started");
    while (run) {
        org.structr.core.agent.Task nextTask = null;
        synchronized(taskQueue) {
            nextTask = taskQueue.poll();
            if (nextTask != null) {
                assignNextAgentForTask(nextTask);
            }
        }
        try {
            java.lang.Thread.sleep(10);
        } catch (java.lang.Exception ex) {
        }
    } 
}