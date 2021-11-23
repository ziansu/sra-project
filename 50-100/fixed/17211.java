public java.util.List<com.ctrip.framework.apollo.biz.entity.Cluster> findClusters(java.lang.String appId) {
    if (com.google.common.base.Strings.isNullOrEmpty(appId)) {
        return java.util.Collections.emptyList();
    }
    java.util.List<com.ctrip.framework.apollo.biz.entity.Cluster> clusters = clusterRepository.findByAppId(appId);
    java.util.Collections.sort(clusters);
    if (clusters == null) {
        return java.util.Collections.emptyList();
    }
    return clusters;
}