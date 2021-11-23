@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> generateCredentialsInfo(java.lang.String serviceInstanceId) {
    return new java.util.HashMap<java.lang.String, java.lang.Object>() {
        {
            put("uri", clusterConfig.getYarnRMUrl());
            put("host", clusterConfig.getYarnRMHost());
            put("port", clusterConfig.getYarnRMPort());
        }
    };
}