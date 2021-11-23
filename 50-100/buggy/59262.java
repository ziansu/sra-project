private void repairRange(com.emc.storageos.db.server.impl.RepairJobRunner.StringTokenRange range) throws java.lang.InterruptedException {
    listener.onStartToken(range.end, getProgress());
    repairRangeDone = false;
    int cmd = svcProxy.forceRepairRangeAsync(range.begin, range.end, keySpaceName, true, false, true);
    com.emc.storageos.db.server.impl.RepairJobRunner._log.info("Wait for repairing this range to be done cmd={}", cmd);
    if (cmd > 0) {
        while (!(repairRangeDone)) {
            finished.await();
        } 
    }
    com.emc.storageos.db.server.impl.RepairJobRunner._log.info("Repair this range is done success={}", _success);
}