@java.lang.Override
public com.ctrip.zeus.service.status.impl.AppServerStatus getAppServerStatus(java.lang.String appName, java.lang.String slbName, java.lang.String ip, java.lang.Integer port) throws java.lang.Exception {
    com.ctrip.zeus.service.status.impl.AppServerStatus appServerStatus = new com.ctrip.zeus.service.status.impl.AppServerStatus();
    appServerStatus.setIp(ip);
    appServerStatus.setPort(port);
    boolean memberUp = statusService.getAppServerStatus(slbName, appName, ip);
    boolean serverUp = statusService.getServerStatus(ip);
    boolean backendUp = getUpstreamStatus(appName, ip);
    appServerStatus.setServer(serverUp);
    appServerStatus.setMember(memberUp);
    appServerStatus.setUp(backendUp);
    return appServerStatus;
}