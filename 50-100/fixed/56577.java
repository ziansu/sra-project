public synchronized com.fdt.jimbo.task.NewsTask getTask() {
    synchronized(this) {
        if ((runThreadsCount.get()) < (com.fdt.jimbo.task.TaskFactory.MAX_THREAD_COUNT)) {
            if (!(isTaskFactoryEmpty())) {
                return taskQueue.remove(rnd.nextInt(taskQueue.size()));
            }
        }
        return null;
    }
}