private boolean repairHasSegmentRunning(long repairRunId) {
    java.util.Collection<com.spotify.reaper.core.RepairSegment> segments = context.storage.getRepairSegmentsForRun(repairRunId);
    for (com.spotify.reaper.core.RepairSegment segment : segments) {
        if ((segment.getState()) == (RepairSegment.State.RUNNING)) {
            com.spotify.reaper.service.SegmentRunner.LOG.info("segment '{}' is running on host '{}' and with a fail count of {}", segment.getId(), segment.getCoordinatorHost(), segment.getFailCount());
            return true;
        }
    }
    return false;
}