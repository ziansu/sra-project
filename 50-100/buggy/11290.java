private java.lang.Integer[] compareAndSetStubStatusDelta(java.lang.String rawStubStatus, com.ctrip.zeus.nginx.entity.TrafficStatus trafficStatus) {
    java.lang.Integer[] stubStatus = com.ctrip.zeus.util.RollingTrafficStatus.parseStubStatusNumber(rawStubStatus.split("\n"));
    com.ctrip.zeus.util.RollingTrafficStatus.extractStubStatus(com.ctrip.zeus.util.RollingTrafficStatus.getDelta(stubStatus, lastStubStatus), trafficStatus);
    return stubStatus;
}