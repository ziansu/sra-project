private static org.apache.falcon.service.FalconService getService(java.lang.String serviceName) {
    return org.apache.falcon.service.Services.get().isRegistered(serviceName) ? org.apache.falcon.service.Services.get().getService(serviceName) : null;
}