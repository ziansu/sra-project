@java.lang.Override
public void onLeft(hudson.model.Queue.LeftItem li) {
    org.zeroturnaround.stats.ClusterStatisticsPlugin plugin = org.zeroturnaround.stats.ClusterStatisticsPlugin.getInstance();
    org.zeroturnaround.stats.model.RunStats stats = plugin.getStatsData().getUnInitializedItem(li.id);
    if (stats != null) {
        stats.setStarted(java.lang.System.currentTimeMillis());
    }else {
        org.zeroturnaround.stats.MyQueueListener.log.fine("Unable to find the task from Eden space for startup. Ignoring.");
    }
}