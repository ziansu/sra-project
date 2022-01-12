@java.lang.Override
public void getGroupFeaturesStat(final org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef nodeRef) {
    com.google.common.base.Preconditions.checkArgument((nodeRef != null), org.opendaylight.openflowplugin.applications.statistics.manager.impl.StatRpcMsgManagerImpl.MSG_NODE_REF_NOT_NULL);
    org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GetGroupFeaturesInputBuilder input = new org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GetGroupFeaturesInputBuilder().setNode(nodeRef);
    registrationRpcFutureCallBack(groupStatsService.getGroupFeatures(input.build()), null, nodeRef, null);
}