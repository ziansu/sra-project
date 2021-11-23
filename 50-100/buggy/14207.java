@java.lang.Override
public void run() {
    while (true) {
        java.lang.Runnable task = tasks.poll();
        while (task == null) {
            synchronized(lock) {
                try {
                    lock.wait();
                    task = tasks.poll();
                } catch (java.lang.InterruptedException e) {
                    throw new ru.sbt.homework13.thread_pool.WorkerException("Worker has been interrupted while waiting", e);
                }
            }
        } 
        try {
            task.run();
        } catch (java.lang.Exception e) {
            throw new ru.sbt.homework13.thread_pool.WorkerException("Exception occurred during worker running", e);
        }
    } 
}