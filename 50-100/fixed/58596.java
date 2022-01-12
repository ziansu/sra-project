@java.lang.Override
public void start() {
    synchronized(this) {
        if (!(isStarted.get())) {
            for (int i = 0; i < (minWorkerCount); i++) {
                workers.add(new ru.sbt.hometask14.threadpool.ConcurrentScalableThreadPool.Worker());
                workers.get(i).start();
            }
            isStarted.set(true);
        }
    }
}