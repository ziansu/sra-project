public static es.socib.netcdftokml.DeploymentInfo createDeploymentInfo(java.lang.String time, java.lang.String longitude, java.lang.String latitude) {
    if (((null == time) || (null == longitude)) || (null == latitude)) {
        es.socib.netcdftokml.DeploymentInfo.logger.warn("createDeploymentInfo() -- One or more of the needed parameters are null. Null DeploymentInfo was returned");
        return null;
    }
    return new es.socib.netcdftokml.DeploymentInfo(time, longitude, latitude);
}