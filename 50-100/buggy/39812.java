public java.lang.String getAlertFilterEvaluation(java.lang.Long functionId, java.lang.Long startTimeISO, java.lang.Long endTimeISO) {
    com.linkedin.thirdeye.anomaly.utils.DetectionResourceHttpUtils httpUtils = new com.linkedin.thirdeye.anomaly.utils.DetectionResourceHttpUtils(com.linkedin.thirdeye.tools.CloneFunctionAndAutoTuneAlertFilterTool.LOCALHOST, com.linkedin.thirdeye.tools.CloneFunctionAndAutoTuneAlertFilterTool.APPLICATION_PORT);
    try {
        return httpUtils.getEvalStatsAlertFilter(functionId, startTimeISO, endTimeISO);
    } catch (java.lang.Exception e) {
        com.linkedin.thirdeye.tools.CloneFunctionAndAutoTuneAlertFilterTool.LOG.warn(e.getMessage());
    }
    return null;
}