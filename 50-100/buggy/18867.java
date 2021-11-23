public round_robin.Event startIoOperation(long clock) {
    if (((activeProcess) == null) && (!(ioQueue.isEmpty()))) {
        activeProcess = ioQueue.remove(0);
        activeProcess.leftIoQueue(clock);
        (statistics.nofProcessedIoOperations)++;
        return new round_robin.Event(Event.END_IO, (clock + (avgIoTime)));
    }
    return null;
}