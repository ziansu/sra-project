void closeShop() {
    if ((this.inFileWorker) != null) {
        this.inFileWorker.closeShop();
    }
    if ((this.outFileWorker) != null) {
        this.outFileWorker.closeShop();
    }
    if ((this.workers) != null) {
        for (org.simplity.tp.FileProcessor.Worker worker : this.workers) {
            worker.closeShop();
        }
    }
}