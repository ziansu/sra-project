public static java.util.Map<java.net.URI, java.util.Map<com.emc.storageos.db.client.model.VolumeTopology.VolumeTopologyRole, java.net.URI>> transformPerformanceParams(java.util.List<com.emc.storageos.model.block.BlockPerformanceParamsMap> performanceParamsMapList) {
    java.util.Map<java.net.URI, java.util.Map<com.emc.storageos.db.client.model.VolumeTopology.VolumeTopologyRole, java.net.URI>> resultMap = new java.util.HashMap<>();
    if (!(org.springframework.util.CollectionUtils.isEmpty(performanceParamsMapList))) {
        for (com.emc.storageos.model.block.BlockPerformanceParamsMap performanceParamsMap : performanceParamsMapList) {
            if (performanceParamsMap != null) {
                resultMap.put(performanceParamsMap.getVirtualArray(), com.emc.storageos.api.service.impl.resource.utils.PerformanceParamsUtils.transformPerformanceParams(performanceParamsMap));
            }
        }
    }
    return resultMap;
}