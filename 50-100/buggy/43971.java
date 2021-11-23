@java.lang.Override
public void onEnterWaiting(hudson.model.Queue.WaitingItem wi) {
    org.zeroturnaround.stats.model.RunStats stats = new org.zeroturnaround.stats.model.RunStats();
    stats.setProjectName(wi.task.getName());
    stats.setQueueId(wi.id);
    org.zeroturnaround.stats.ClusterStatisticsPlugin plugin = org.zeroturnaround.stats.ClusterStatisticsPlugin.getInstance();
    plugin.getStatsData().addToEdenSpace(stats);
}