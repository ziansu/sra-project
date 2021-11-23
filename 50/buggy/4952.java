public void start(int iters) {
    mClient.connect();
    init();
    workload(iters);
}