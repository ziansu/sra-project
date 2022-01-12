private void transferProcessFromMemToReady() {
    java.lang.Process p = memory.checkMemory(clock);
    while (p != null) {
        round_robin.Event event = cpu.insertProcess(p, clock);
        p.leftMemoryQueue(clock);
        if (event != null) {
            eventQueue.insertEvent(event);
        }
        memory.processCompleted(p);
        transferProcessFromMemToReady();
        p.updateStatistics(statistics);
        p = memory.checkMemory(clock);
    } 
}