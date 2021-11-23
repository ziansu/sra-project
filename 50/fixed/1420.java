public void setShardStatus(int shardIndex, org.wso2.carbon.analytics.dataservice.core.indexing.LocalShardAllocationConfig.ShardStatus status) throws org.wso2.carbon.analytics.datasource.commons.exception.AnalyticsException {
    this.shardStatusMap.put(shardIndex, status);
}