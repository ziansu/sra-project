public void flushEventBatch(birdWars.EventBatch e) {
    birdWars.VpsDB.writeBatch(e, getDateStamp(new java.util.Date()));
    e.clearBatch();
    resetTimer();
}