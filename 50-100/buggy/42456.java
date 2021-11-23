private org.smartdata.actions.SmartAction createAction(java.lang.String name) throws java.io.IOException {
    org.smartdata.actions.SmartAction smartAction = actionRegistry.createAction(name);
    smartAction.setContext(smartContext);
    if (smartAction instanceof org.smartdata.actions.hdfs.HdfsAction) {
        ((org.smartdata.actions.hdfs.HdfsAction) (smartAction)).setDfsClient(new org.smartdata.client.SmartDFSClient(ssm.getNamenodeURI(), smartContext.getConf(), getRpcServerAddress()));
    }
    smartAction.getActionStatus().setId(currentActionId);
    (currentActionId)++;
    return smartAction;
}