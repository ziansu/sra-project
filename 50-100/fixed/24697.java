public static void updateMetrics(org.apache.kylin.rest.request.SQLRequest sqlRequest, org.apache.kylin.rest.response.SQLResponse sqlResponse) {
    if (!(org.apache.kylin.rest.metrics.QueryMetricsFacade.enabled))
        return ;
    
    java.lang.String projectName = sqlRequest.getProject();
    java.lang.String cubeName = sqlResponse.getCube();
    org.apache.kylin.rest.metrics.QueryMetricsFacade.update(org.apache.kylin.rest.metrics.QueryMetricsFacade.getQueryMetrics("Server_Total"), sqlResponse);
    org.apache.kylin.rest.metrics.QueryMetricsFacade.update(org.apache.kylin.rest.metrics.QueryMetricsFacade.getQueryMetrics(projectName), sqlResponse);
    java.lang.String cubeMetricName = (projectName + ",sub=") + cubeName;
    org.apache.kylin.rest.metrics.QueryMetricsFacade.update(org.apache.kylin.rest.metrics.QueryMetricsFacade.getQueryMetrics(cubeMetricName), sqlResponse);
}