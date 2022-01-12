public void doneAdding() {
    if (this.cleanedUp) {
        throw new java.lang.IllegalStateException("Cannot call doneAdding() after cleanup() was called.");
    }
    if (doneAdding) {
        return ;
    }
    doneAdding = true;
    if ((this.numRecordsInRam) > 0) {
        spillToDisk();
    }
    service.shutdown();
    while (!(service.isTerminated())) {
    } 
    this.ramRecords = null;
}