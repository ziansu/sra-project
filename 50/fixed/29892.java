private void engageBulkhead() {
    if (!(bulkhead)) {
        integrity = (integrity) + (main.Door.BULKHEAD_STRENGTH);
        bulkhead = true;
    }
    closeLock();
}