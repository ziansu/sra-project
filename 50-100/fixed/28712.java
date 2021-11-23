public boolean isVirtualWorker() {
    boolean isVirtual = false;
    if ((this.workerModel) != null) {
        if ((this.workerModel.getWorker()) != null) {
            isVirtual = this.workerModel.getWorker().isVirtual();
        }
    }
    return isVirtual;
}