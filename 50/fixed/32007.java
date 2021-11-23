public us.codecraft.webmagic.Spider thread(java.util.concurrent.ExecutorService executorService, int threadNum) {
    checkIfRunning();
    this.threadNum = threadNum;
    if (threadNum <= 0) {
        throw new java.lang.IllegalArgumentException("threadNum should be more than one!");
    }
    this.executorService = executorService;
    return this;
}