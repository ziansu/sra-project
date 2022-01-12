public synchronized com.fdt.jimbo.task.NewsTask getTask() {
    synchronized(this) {
        if ((runThreadsCount) < (com.fdt.jimbo.task.TaskFactory.MAX_THREAD_COUNT)) {
            if (!(isTaskFactoryEmpty())) {
                return taskQueue.remove(rnd.nextInt(taskQueue.size()));
            }
        }
        return null;
    }
}