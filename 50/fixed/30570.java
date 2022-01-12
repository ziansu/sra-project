@java.lang.Override
public void run() {
    while (isRunning()) {
        org.threadly.concurrent.TaskWrapper nextTask = workerPool.workerIdle(this);
        if (nextTask != null) {
            nextTask.runTask();
        }
    } 
}