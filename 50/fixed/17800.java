public void refreshLocalIndexShards(java.util.Set<java.lang.Integer> localShards) throws org.wso2.carbon.analytics.datasource.commons.exception.AnalyticsException {
    this.localShards = localShards;
    this.localIndexDataStore.refreshLocalIndexShards();
    if (org.wso2.carbon.analytics.dataservice.core.indexing.IndexNodeCoordinator.checkIfIndexingNode()) {
        this.reschuduleWorkers();
    }
}