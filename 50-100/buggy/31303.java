@java.lang.Override
public void run() {
    ru.spbau.mit.ThreadPoolImpl.PackagedTask task;
    while (!(java.lang.Thread.interrupted())) {
        try {
            task = getTask();
        } catch (java.lang.InterruptedException e) {
            return ;
        }
        task.execute();
        final ru.spbau.mit.ThreadPoolImpl.LightFutureImpl future = task.getFuture();
        synchronized(future) {
            task = future.getNextTask();
            if (task != null) {
                task.execute();
            }
        }
    } 
}