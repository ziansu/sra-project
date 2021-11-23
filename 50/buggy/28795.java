@java.lang.Override
public void onStartContainerError(org.apache.hadoop.yarn.api.records.ContainerId cid, java.lang.Throwable ex) {
    org.apache.hadoop.yarn.dmlc.ApplicationMaster.LOG.debug(("onStartContainerError Invoked: " + (ex.toString())));
    this.handleFailure(java.util.Collections.singletonList(cid));
}