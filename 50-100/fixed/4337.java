@java.lang.Override
public boolean onRestart(com.twitter.heron.proto.scheduler.Scheduler.RestartTopologyRequest request) {
    int containerId = request.getContainerIndex();
    if (containerId == (-1)) {
        return com.twitter.heron.scheduler.yarn.HeronMasterDriverProvider.getInstance().restartTopology();
    }else {
        return com.twitter.heron.scheduler.yarn.HeronMasterDriverProvider.getInstance().restartWorker(java.lang.String.valueOf(containerId));
    }
}