private void addWorkers(int count) {
    workerCount = count;
    workers = new java.util.ArrayList<>();
    for (int i = 0; i < count; i++) {
        com.astedt.robin.concurrentobjecthandler.ConcurrentObjectWorker worker = new com.astedt.robin.concurrentobjecthandler.ConcurrentObjectWorker(this, i);
        workers.add(worker);
    }
}