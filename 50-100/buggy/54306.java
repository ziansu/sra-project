public synchronized int getEvent(matching.eventProcessor.parallel.HybridThread hybridThread) {
    if ((this.nextEventIndex.intValue()) >= (this.maxNumberEvents))
        return -1;
    
    while (!(this.hybridEventTasks[this.nextEventIndex.intValue()].isEventAvailable(hybridThread))) {
        if ((this.nextEventIndex.incrementAndGet()) >= (this.maxNumberEvents))
            return -1;
        
    } 
    return this.nextEventIndex.intValue();
}