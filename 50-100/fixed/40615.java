@org.wso2.carbon.device.mgt.iot.droneanalyzer.service.OnClose
public void onClose(org.wso2.carbon.device.mgt.iot.droneanalyzer.service.Session session) {
    try {
        xmppConnector.disconnect();
        org.wso2.carbon.device.mgt.iot.droneanalyzer.service.DroneRealTimeService.log.info("XMPP connection is disconnected");
    } catch (java.lang.Exception e) {
        org.wso2.carbon.device.mgt.iot.droneanalyzer.service.DroneRealTimeService.log.error((((e.getMessage()) + "\n") + e));
    }
    org.wso2.carbon.device.mgt.iot.droneanalyzer.service.DroneRealTimeService.log.info((("Session " + (session.getId())) + " has ended"));
}