protected org.threadly.concurrent.PriorityScheduler.Worker makeNewWorker() {
    org.threadly.concurrent.PriorityScheduler.Worker w = new org.threadly.concurrent.PriorityScheduler.Worker(this, threadFactory);
    w.start();
    return w;
}