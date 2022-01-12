private java.util.List<com.amazonaws.services.cloudwatch.model.Datapoint> getResultMetricDatapoints(java.lang.String strMeasureName, java.util.List<com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult> oResultList) {
    for (com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult oTmpResult : oResultList) {
        if (oTmpResult.getLabel().equals(strMeasureName))
            return oTmpResult.getDatapoints();
        
    }
    return new java.util.ArrayList<com.amazonaws.services.cloudwatch.model.Datapoint>();
}