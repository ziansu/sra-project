@java.lang.Override
public void onSuccess(co.cask.cdap.common.zookeeper.coordination.ResourceAssignment result) {
    co.cask.cdap.common.zookeeper.coordination.ResourceCoordinator.LOG.debug("Resource assignment updated for {}. {}", result.getName(), co.cask.cdap.api.common.Bytes.toString(data));
}