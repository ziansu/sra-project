public void notifyFailure(rainbow.scheduler.partition.Partition b) {
    if (processing.contains(b)) {
        processing.remove(b);
    }
    if ((b.startBlockNumber) < (nextAvailable.startBlockNumber)) {
        nextAvailable = b;
    }
}