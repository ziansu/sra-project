@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> getProperties() {
    java.util.Map<java.lang.String, java.lang.String> properties = new java.util.HashMap<>();
    properties.put(DolphinPlatformConfiguration.EVENTBUS_TYPE, com.canoo.dolphin.server.event.DistributedEventBusProvider.DISTRIBUTED_EVENTBUS_NAME);
    properties.put(com.canoo.dolphin.server.event.DistributedEventBusConfigProvider.HAZELCAST_SERVER_NAME, com.canoo.dolphin.server.event.DistributedEventBusConfigProvider.DEFAULT_HAZELCAST_SERVER);
    properties.put(com.canoo.dolphin.server.event.DistributedEventBusConfigProvider.HAZELCAST_SERVER_PORT, com.canoo.dolphin.server.event.DistributedEventBusConfigProvider.DEFAULT_HAZELCAST_PORT);
    properties.put(com.canoo.dolphin.server.event.DistributedEventBusConfigProvider.HAZELCAST_GROUP_NAME, com.canoo.dolphin.server.event.DistributedEventBusConfigProvider.DEFAULT_HAZELCAST_GROUP_NAME);
    return null;
}