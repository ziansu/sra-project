public static boolean isMessageMonitoringEnabled() {
    java.lang.String messageMonitoringEnabled = gov.hhs.fha.nhinc.direct.messagemonitoring.util.MessageMonitoringUtil.getPropertyStringValue("MessageMonitoringEnabled");
    if (messageMonitoringEnabled == null) {
        return gov.hhs.fha.nhinc.direct.messagemonitoring.util.MessageMonitoringUtil.DEFAULT_MESSAGE_MONITORING_ENABLED;
    }else {
        return "true".equals(messageMonitoringEnabled);
    }
}