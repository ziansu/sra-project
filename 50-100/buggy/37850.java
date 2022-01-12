@java.lang.Override
public void getGroupFeaturesStat(final org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef nodeRef) {
    com.google.common.base.Preconditions.checkArgument((nodeRef != null), org.opendaylight.openflowplugin.applications.statistics.manager.impl.StatRpcMsgManagerImpl.MSG_NODE_REF_NOT_NULL);
    final org.opendaylight.openflowplugin.applications.statistics.manager.impl.RpcJobsQueue getGroupFeaturesStat = new org.opendaylight.openflowplugin.applications.statistics.manager.impl.RpcJobsQueue() {
        @java.lang.Override
        public java.lang.Void call() throws java.lang.Exception {
            final org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GetGroupFeaturesInputBuilder input = new org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GetGroupFeaturesInputBuilder();
            input.setNode(nodeRef);
            registrationRpcFutureCallBack(groupStatsService.getGroupFeatures(input.build()), null, nodeRef, null);
            return null;
        }
    };
    addStatJob(getGroupFeaturesStat);
}