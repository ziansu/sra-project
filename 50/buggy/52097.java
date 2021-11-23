public round_robin.Event activeProcessLeft(long clock) {
    java.lang.Process leavingProcess = activeProcess;
    leavingProcess.leftCpu(clock);
    cpuQueue.add(leavingProcess);
    activeProcess = null;
    return switchProcess(clock);
}