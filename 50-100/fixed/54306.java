public synchronized int getEvent(matching.eventProcessor.parallel.HybridThread hybridThread) {
    if ((this.nextEventIndex) >= (this.maxNumberEvents))
        return -1;
    
    while (!(this.hybridEventTasks[this.nextEventIndex].isEventAvailable(hybridThread))) {
        if ((++(this.nextEventIndex)) >= (this.maxNumberEvents))
            return -1;
        
    } 
    return this.nextEventIndex;
}