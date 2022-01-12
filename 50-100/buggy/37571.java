public java.lang.String getEvalStatsAlertFilter(java.lang.Long functionId, java.lang.Long startTimeIso, java.lang.Long endTimeIso) throws java.lang.Exception {
    org.apache.http.client.methods.HttpPost req = new org.apache.http.client.methods.HttpPost((((((((com.linkedin.thirdeye.anomaly.utils.DetectionResourceHttpUtils.DETECTION_JOB_ENDPOINT) + (com.linkedin.thirdeye.anomaly.utils.DetectionResourceHttpUtils.EVAL_FILTER)) + functionId) + "?startTime=") + startTimeIso) + "&endTime=") + endTimeIso));
    return callJobEndpoint(req);
}