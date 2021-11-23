@java.lang.Override
public void run() {
    ru.spbau.mit.ThreadPoolImpl.PackagedTask task = null;
    while (!(java.lang.Thread.interrupted())) {
        if (task == null) {
            try {
                task = getTask();
            } catch (java.lang.InterruptedException e) {
                return ;
            }
        }
        task.execute();
        final ru.spbau.mit.ThreadPoolImpl.LightFutureImpl future = task.getFuture();
        synchronized(future) {
            task = future.getNextTask();
        }
    } 
}