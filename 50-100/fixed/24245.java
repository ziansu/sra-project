public static void postpone(com.spotify.reaper.AppContext context, com.spotify.reaper.core.RepairSegment segment) {
    com.spotify.reaper.service.SegmentRunner.LOG.info("Postponing segment {}", segment.getId());
    context.storage.updateRepairSegment(segment.with().state(RepairSegment.State.NOT_STARTED).coordinatorHost(null).repairCommandId(null).startTime(null).failCount(((segment.getFailCount()) + 1)).build(segment.getId()));
    com.spotify.reaper.service.SegmentRunner.segmentRunners.remove(segment.getId());
}