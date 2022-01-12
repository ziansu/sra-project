@java.lang.Override
public void start() {
    synchronized(lock) {
        if (!(isStarted)) {
            for (int i = 0; i < (minWorkerCount); i++) {
                workers.add(new ru.sbt.hometask13.threadpool.ScalableThreadPool.Worker());
                workers.get(i).start();
            }
            isStarted = true;
        }
    }
}