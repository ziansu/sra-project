public round_robin.Event activeProcessLeft(long clock) {
    if (((activeProcess) == null) && (!(cpuQueue.isEmpty()))) {
        return switchProcess(clock);
    }
    return null;
}