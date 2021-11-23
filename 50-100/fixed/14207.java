@java.lang.Override
public void run() {
    while (true) {
        java.lang.Runnable task;
        synchronized(lock) {
            while (tasks.isEmpty()) {
                try {
                    lock.wait();
                } catch (java.lang.InterruptedException e) {
                    throw new ru.sbt.homework13.thread_pool.WorkerException("Worker has been interrupted while waiting", e);
                }
            } 
            task = tasks.poll();
        }
        try {
            task.run();
        } catch (java.lang.Exception e) {
            throw new ru.sbt.homework13.thread_pool.WorkerException("Exception occurred during worker running", e);
        }
    } 
}