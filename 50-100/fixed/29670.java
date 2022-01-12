@com.google.common.annotations.VisibleForTesting
public static int getPossibleParallelRepairsCount(java.util.Map<java.util.List<java.lang.String>, java.util.List<java.lang.String>> ranges) throws com.spotify.reaper.ReaperException {
    if (ranges.isEmpty()) {
        java.lang.String msg = "Repairing 0-sized cluster.";
        com.spotify.reaper.service.RepairRunner.LOG.error(msg);
        throw new com.spotify.reaper.ReaperException(msg);
    }
    return (ranges.size()) / (ranges.values().iterator().next().size());
}