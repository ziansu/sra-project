@java.lang.Override
public void removeMap(java.lang.String mapName) {
    org.wso2.carbon.core.clustering.hazelcast.HazelcastDistributedMapProvider.DistMap map = maps.get(mapName);
    if (map != null) {
        hazelcastInstance.getMap(mapName).removeEntryListener(map.getListenerId());
    }
    maps.remove(mapName);
    hazelcastInstance.getMap(mapName).flush();
}