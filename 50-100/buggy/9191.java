@org.osgi.service.component.annotations.Reference(name = "org.wso2.carbon.datasource.DataSourceService", service = org.wso2.carbon.datasource.core.api.DataSourceService.class, cardinality = org.osgi.service.component.annotations.ReferenceCardinality.AT_LEAST_ONE, policy = org.osgi.service.component.annotations.ReferencePolicy.DYNAMIC, unbind = "unregisterDataSourceService")
protected void onDataSourceServiceReady(org.wso2.carbon.datasource.core.api.DataSourceService service) {
    try {
        com.zaxxer.hikari.HikariDataSource dsObject = ((com.zaxxer.hikari.HikariDataSource) (service.getDataSource("WSO2_CARBON_DB")));
        java.sql.Connection connection = dsObject.getConnection();
    } catch (org.wso2.carbon.datasource.core.exception.DataSourceException e) {
        org.wso2.carbon.datasource.sample.DataSourceServiceListenerComponent.logger.error("error occurred while fetching the data source.");
    } catch (java.sql.SQLException e) {
        org.wso2.carbon.datasource.sample.DataSourceServiceListenerComponent.logger.error("error occurred while fetching the connection.");
    }
}