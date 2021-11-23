@java.lang.Override
public void start() {
    for (int i = 0; i < (minWorkerCount); i++) {
        workers.add(new ru.sbt.hometask13.threadpool.ScalableThreadPool.Worker());
        workers.get(i).start();
    }
    synchronized(lock) {
        isStarted = true;
    }
}