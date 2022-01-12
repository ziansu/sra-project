private java.lang.String buildHashField(final org.sentilo.platform.service.monitor.RequestType requestType, final org.sentilo.common.utils.EventType eventType) {
    final java.lang.String sRequestType = requestType.name().toLowerCase();
    final java.lang.String sEventType = eventType.name().toLowerCase();
    return (sEventType + "_") + sRequestType;
}