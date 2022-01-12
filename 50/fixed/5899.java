@java.lang.Override
public void removedEventStream(int tenantId, java.lang.String streamName, java.lang.String streamVersion) {
    if (null != (org.wso2.carbon.event.simulator.core.internal.ds.EventSimulatorValueHolder.getEventProducerMap(tenantId))) {
        org.wso2.carbon.event.simulator.core.internal.ds.EventSimulatorValueHolder.getEventProducerMap(tenantId).remove(org.wso2.carbon.databridge.commons.utils.DataBridgeCommonsUtils.generateStreamId(streamName, streamVersion));
    }
}