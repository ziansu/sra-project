public void leftIo(long clock) {
    timeSpentInIo += clock - (timeOfLastEvent);
    timeToNextIoOperation = avgIoInterval;
    timeOfLastEvent = clock;
}