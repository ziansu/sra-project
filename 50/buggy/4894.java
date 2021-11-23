public round_robin.Event insertProcess(java.lang.Process p, long clock) {
    if ((activeProcess) == null) {
        activeProcess = p;
        return null;
    }else {
        cpuQueue.add(p);
        return this.switchProcess(clock);
    }
}