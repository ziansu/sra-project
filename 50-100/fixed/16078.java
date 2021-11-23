protected tlc2.tool.IWorker[] startWorkers(tlc2.tool.AbstractChecker checker, int checkIndex) {
    for (int i = 0; i < (this.workers.length); i++) {
        this.workers[i] = new tlc2.tool.DFIDWorker(i, checkIndex, checker);
    }
    for (int i = 0; i < (this.workers.length); i++) {
        this.workers[i].start();
    }
    return this.workers;
}