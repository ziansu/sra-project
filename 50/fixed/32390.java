public void notifyFailure(rainbow.scheduler.partition.Partition b) {
    if (processing.contains(b)) {
        processing.remove(b);
    }
    if ((b.compareTo(nextAvailable)) < 0) {
        nextAvailable = b;
    }
}