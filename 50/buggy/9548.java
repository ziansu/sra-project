public void addEvent(int eventID) {
    this.hybridEventsWork[this.numberEvents.get()] = new matching.eventProcessor.parallel.HybridEvent(eventID);
    startThreads();
    this.numberEvents.incrementAndGet();
}