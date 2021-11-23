public void incrementSuccessfulPolls(long time) {
    successfulPolls.incrementAndGet();
    boolean lastPollSuccessful = this.lastPollSuccessful.getAndSet(true);
    if (lastPollSuccessful) {
        int eventId = vo.getPollAbortedExceptionEventId();
        if (eventId >= 0) {
            returnToNormal(eventId, time);
        }
    }
}