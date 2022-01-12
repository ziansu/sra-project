public java.lang.String runAutoTune(java.lang.Long functionId, java.lang.Long startTime, java.lang.Long endTime, java.lang.String autoTuneType) throws java.lang.Exception {
    org.apache.http.client.methods.HttpPost req = new org.apache.http.client.methods.HttpPost((((((((((com.linkedin.thirdeye.anomaly.utils.DetectionResourceHttpUtils.DETECTION_JOB_ENDPOINT) + (com.linkedin.thirdeye.anomaly.utils.DetectionResourceHttpUtils.AUTOTUNE_FILTER)) + functionId) + "?startTime=") + startTime) + "&endTime=") + endTime) + "&autoTuneType=") + autoTuneType));
    return callJobEndpoint(req);
}