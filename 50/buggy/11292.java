private static void processFlowStatistics(final java.lang.Iterable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowsStatisticsUpdate> data, final org.opendaylight.openflowplugin.api.openflow.device.DeviceContext deviceContext) {
    org.opendaylight.openflowplugin.impl.statistics.StatisticsGatheringUtils.deleteAllKnownFlows(deviceContext, deviceContext.getDeviceState().getNodeInstanceIdentifier());
    org.opendaylight.openflowplugin.impl.statistics.StatisticsGatheringUtils.writeFlowStatistics(data, deviceContext);
    deviceContext.submitTransaction();
}